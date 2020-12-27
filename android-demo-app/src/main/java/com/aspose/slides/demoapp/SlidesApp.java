package com.aspose.slides.demoapp;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;

import com.aspose.slides.ApiException;
import com.aspose.slides.Configuration;
import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.model.SlideExportFormat;
import com.aspose.slides.model.Slides;
import com.aspose.slides.model.request.GetSlidesSlidesListRequest;
import com.aspose.slides.model.request.PostSlideSaveAsRequest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arsen
 */
public class SlidesApp extends Application {
    private Size slideThumbnailSize;
    private Size slideListThumbnailSize;
    private List<Bitmap> slideList;
    private Bitmap currSlide;
    private int currSlideIdx = 0;

    private SlidesApi api;
    private String name;
    private String folder;

    public void setPresentation(String name, String folder, Size slideViewSize, Size slideListViewSize) {
        this.slideList = null;
        this.currSlide = null;

        calcThumbnailSizes(slideViewSize, slideListViewSize);
        this.name = name;
        this.folder = folder;
        initSlideList();
    }

    private void calcThumbnailSizes(Size slideViewSize, Size slideListViewSize) {
        this.slideThumbnailSize = calcFittedSize(slideViewSize);
        this.slideListThumbnailSize = calcFittedSize(slideListViewSize);
    }

    private Size calcFittedSize(Size dstSize) {
        float ratio = 0.6f;
        int minDstSize = Math.min(dstSize.getWidth(), dstSize.getHeight());

        if(ratio > 1f) {
            return new Size(minDstSize, (int)(minDstSize / ratio));
        } else {
            return new Size((int)(minDstSize * ratio), minDstSize);
        }
    }

    private void initSlideList() {
        GetSlidesSlidesListRequest listRequest = new GetSlidesSlidesListRequest();
        listRequest.setName(name);
        listRequest.setFolder(folder);
        try {
            Slides slides = getSlidesApi().getSlidesSlidesList(listRequest);
            int slideCount = slides.getSlideList().size();
            this.slideList = new ArrayList<>(slideCount);
            for (int i = 0; i < slideCount; i++) {
                slideList.add(loadSlideBitmap(i, slideListThumbnailSize.getWidth(), slideListThumbnailSize.getHeight()));
            }
        } catch (ApiException ex) {
            int i = 0;
            i++;
        }
    }

    public Bitmap selectSlide(int idx) {
        if(currSlideIdx == idx && currSlide != null && !currSlide.isRecycled()) {
            return currSlide;
        }

        this.currSlideIdx = idx;

        this.currSlide = loadSlideBitmap(idx, slideThumbnailSize.getWidth(), slideThumbnailSize.getHeight());
        return this.currSlide;
    }

    public List<Bitmap> getSlideList() {
        return slideList;
    }

    private SlidesApi getSlidesApi() {
        if (api == null) {
            Configuration config = new Configuration();
            Resources resources = getResources();
            config.setBaseUrl(resources.getString(R.string.api_url));
            config.setAppSid(resources.getString(R.string.client_id));
            config.setAppKey(resources.getString(R.string.client_secret));
            api = new SlidesApi(config);
        }
        return api;
    }

    private Bitmap loadSlideBitmap(int slideIndex, int width, int height) {
        try {
            PostSlideSaveAsRequest slideRequest = new PostSlideSaveAsRequest();
            slideRequest.setName(name);
            slideRequest.setFolder(folder);
            slideRequest.setSlideIndex(slideIndex + 1);
            slideRequest.setFormat(SlideExportFormat.JPEG);
            slideRequest.setWidth(width);
            slideRequest.setHeight(height);
            File file = getSlidesApi().postSlideSaveAs(slideRequest);
            BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[(int)file.length()];
            buf.read(bytes, 0, bytes.length);
            buf.close();
            return BitmapFactory.decodeByteArray(bytes,0, bytes.length);
        } catch (ApiException ex) {
        } catch (IOException ex) {
        }
        return null;
    }
}
