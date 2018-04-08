package com.example.ausrine.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find views that link activities
        Button songlibrary = (Button)findViewById(R.id.songlibrary);

        //Set up a click listener to listener for buttons being clicked
        songlibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(NowPlayingActivity.this, MusicLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
}
