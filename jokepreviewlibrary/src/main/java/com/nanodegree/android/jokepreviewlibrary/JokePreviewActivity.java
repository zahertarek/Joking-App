package com.nanodegree.android.jokepreviewlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokePreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_preview);
        TextView jokeTextView = findViewById(R.id.joke_text);
        jokeTextView.setText(getIntent().getStringExtra("joke"));
    }
}
