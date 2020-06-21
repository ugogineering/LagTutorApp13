package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PastQuestions extends AppCompatActivity {

    private TextView mShareContactText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_questions);

        mShareContactText = findViewById(R.id.past_questions_textview);
    }


    public void contactUs(View view) {
        Intent intent3 = new Intent(this, ContactLagtutor.class);
        startActivity(intent3);
    }
}
