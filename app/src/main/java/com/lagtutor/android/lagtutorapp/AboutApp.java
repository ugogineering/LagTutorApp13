package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
    }

    public void contactLagtutor(View view) {
        Intent intent = new Intent(this, ContactLagtutor.class);
        startActivity(intent);
    }
}
