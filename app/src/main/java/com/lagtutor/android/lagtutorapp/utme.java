package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class utme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utme);
    }

    public void launchAdmissionRequirements(View view) {
        Intent intent = new Intent(this, AdmissionRequirements.class);
        startActivity(intent);
    }

    public void launchAboutApp(View view) {
        Intent intent2 = new Intent(this, AboutApp.class);
        startActivity(intent2);
    }

    public void launchCutoff(View view) {
        Intent intent4 = new Intent(this, CutoffMarks.class);
        startActivity(intent4);
    }

    public void launchUtmeTarget(View view) {
        Intent intent5 = new Intent(this, KnowYourUtmeTarget.class);
        startActivity(intent5);
    }

    public void launchOlevelAggregate(View view) {
        Intent intent6 = new Intent(this, OlevelAggregate.class);
        startActivity(intent6);
    }

    public void launchHomeTutoring(View view) {
        Intent intent7 = new Intent(this, HomeTutoring.class);
        startActivity(intent7);
    }

    public void pastQuestions(View view) {
        Intent intent8 = new Intent(this, PastQuestions.class);
        startActivity(intent8);
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
