package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeTutoring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_tutoring);
    }

    public void contactUs(View view) {
        Intent intent3 = new Intent(this, ContactLagtutor.class);
        startActivity(intent3);
    }
}
