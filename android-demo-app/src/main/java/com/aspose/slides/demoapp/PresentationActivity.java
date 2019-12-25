package com.aspose.slides.demoapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.IOException;
import java.io.InputStream;

public class PresentationActivity extends Activity {
    private static final String TAG = "Aspose.Slides.PresentationActivity";

    private SlidesApp app;
    private ProgressBar progressBar;
    private RecyclerView slideList;
    private SlidesAdapter slidesAdapter;
    private ImageView currSlide;

    private Size currSlideViewSize;
    private Size slidesListViewSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        Intent intent = getIntent();

        String folder = intent.getStringExtra("folder");
        String name = intent.getStringExtra("name");

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Size displaySize = new Size(displayMetrics.widthPixels - 100, displayMetrics.heightPixels - 100);

        this.currSlideViewSize = new Size(displaySize.getWidth() * 3 / 4, displaySize.getHeight() * 3 / 4);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            this.slidesListViewSize = new Size(displaySize.getWidth() / 4, displaySize.getWidth() / 4);
        } else {
            this.slidesListViewSize = new Size(displaySize.getHeight() / 4, displaySize.getHeight() / 4);
        }


        this.app = (SlidesApp) getApplication();
        this.progressBar = findViewById(R.id.progress_bar);

        this.slideList = findViewById(R.id.slide_list);
        this.currSlide = findViewById(R.id.curr_slide);

        this.slidesAdapter = new SlidesAdapter(slidesListViewSize, new OnSlideClickListener(this));

        int slideListOrientation = getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE ?  RecyclerView.VERTICAL : RecyclerView.HORIZONTAL;
        this.slideList.setAdapter(this.slidesAdapter);
        this.slideList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), slideListOrientation, false));
        this.slideList.setItemAnimator(new DefaultItemAnimator());
        this.slideList.addItemDecoration(new DividerItemDecoration(this, slideListOrientation));
        new LoadPresentationTask(this).execute(name, folder);
    }

    private void selectSlide(int pos) {
        new SelectSlideTask(this).execute(pos);
    }

    private void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
        progressBar.bringToFront();
    }

    private void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }


    private static class OnSlideClickListener implements View.OnClickListener {
        private final PresentationActivity presentationActivity;

        private OnSlideClickListener(PresentationActivity presentationActivity) {
            this.presentationActivity = presentationActivity;
        }

        @Override
        public void onClick(View view) {
            int itemPos = presentationActivity.slideList.getChildLayoutPosition(view);
            presentationActivity.selectSlide(itemPos);
        }
    }

    private static class LoadPresentationTask extends AsyncTask<String, Void, Object> {
        private final PresentationActivity presentationActivity;

        private LoadPresentationTask(PresentationActivity presentationActivity) {
            this.presentationActivity = presentationActivity;
        }

        @Override
        protected Object doInBackground(String... inputs) {
            presentationActivity.app.setPresentation(
                    inputs[0], inputs[1], presentationActivity.currSlideViewSize, presentationActivity.slidesListViewSize);
            return null;
        }

        @Override
        protected void onPreExecute() {
            presentationActivity.showProgressBar();
        }

        @Override
        protected void onPostExecute(Object presentation) {
            presentationActivity.hideProgressBar();
            presentationActivity.slidesAdapter.setSlides(presentationActivity.app.getSlideList());
            presentationActivity.selectSlide(0);
        }

        @Override
        protected void onCancelled(Object presentation) {
            presentationActivity.hideProgressBar();
        }

        @Override
        protected void onCancelled() {
            presentationActivity.hideProgressBar();
        }
    }

    private static class SelectSlideTask extends AsyncTask<Integer, Void, Bitmap> {
        private final PresentationActivity presentationActivity;

        public SelectSlideTask(PresentationActivity presentationActivity) {
            this.presentationActivity = presentationActivity;
        }

        @Override
        protected Bitmap doInBackground(Integer... ints) {
            int pos = ints[0];
            return presentationActivity.app.selectSlide(pos);
        }

        @Override
        protected void onPreExecute() {
            presentationActivity.showProgressBar();
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            presentationActivity.hideProgressBar();
            presentationActivity.currSlide.setImageBitmap(result);
        }

        @Override
        protected void onCancelled(Bitmap result) {
            presentationActivity.hideProgressBar();
        }

        @Override
        protected void onCancelled() {
            presentationActivity.hideProgressBar();
        }
    }
}