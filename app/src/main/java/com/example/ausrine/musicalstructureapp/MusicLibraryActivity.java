package com.example.ausrine.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        //Find views that link activities
        Button playbutton = (Button)findViewById(R.id.playbutton);
        Button shufflebutton = (Button)findViewById(R.id.shufflebutton);

        //Set up a click listener to listener for buttons being clicked
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent nowPlayingIntent = new Intent(MusicLibraryActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        shufflebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MusicLibraryActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
