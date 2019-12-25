package com.aspose.slides.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SelectActivity extends AppCompatActivity {
    EditText etFolder;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        etFolder = findViewById(R.id.etFolder);
        etName = findViewById(R.id.etName);

        final Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                execPresentationActivity();
            }
        });
    }

    private void execPresentationActivity() {
        Intent openPresentationIntent = new Intent(SelectActivity.this, PresentationActivity.class);
        openPresentationIntent.putExtra("folder", etFolder.getText().toString());
        openPresentationIntent.putExtra("name", etName.getText().toString());
        startActivity(openPresentationIntent);
    }
}
