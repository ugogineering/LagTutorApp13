package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Foundation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foundation);
    }

    public void launchAdmissionRequirements(View view) {
        Intent intent = new Intent(this, AdmissionRequirements.class);
        startActivity(intent);
    }

    public void contactUs(View view) {
        Intent intent3 = new Intent(this, ContactLagtutor.class);
        startActivity(intent3);
    }
}
