package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class UnilagMba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unilag_mba);
    }

    public void launchAdmissionRequirements(View view) {
        Intent intent = new Intent(this, AdmissionRequirements.class);
        startActivity(intent);
    }

    public void launchOnlineTest(View view) {
        // Get the URL text.
        String url = getString(R.string.cbt_uri);

        // Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Cannot handle this!");
        }
    }

    public void contactUs(View view) {
        Intent intent3 = new Intent(this, ContactLagtutor.class);
        startActivity(intent3);
    }
}
