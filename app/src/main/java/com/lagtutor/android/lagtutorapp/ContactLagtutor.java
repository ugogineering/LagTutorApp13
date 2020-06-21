package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactLagtutor extends AppCompatActivity {

    private TextView mShareContactText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_lagtutor);

        mShareContactText = findViewById(R.id.contact_lagtutor_textview);
    }

    public void shareText(View view) {
        String txt = mShareContactText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.share_text_with)
                .setText(txt)
                .startChooser();
    }
}
