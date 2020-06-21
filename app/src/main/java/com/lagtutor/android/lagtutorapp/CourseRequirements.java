package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourseRequirements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_requirements);

        Intent intent = getIntent();
        String message = intent.getStringExtra(AdmissionRequirements.EXTRA_MESSAGE);
        String messageHeader = intent.getStringExtra(AdmissionRequirements.EXTRA_MESSAGE2);
        TextView textViewHeader = findViewById(R.id.header_text);
        TextView textView = findViewById(R.id.display_from_intent);
        textView.setText(message);
        textViewHeader.setText(messageHeader);
    }

    public void shareThisApp(View view) {
        String txt = getString(R.string.share_this_app_text);
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.share_this_app)
                .setText(txt)
                .startChooser();
    }
}
