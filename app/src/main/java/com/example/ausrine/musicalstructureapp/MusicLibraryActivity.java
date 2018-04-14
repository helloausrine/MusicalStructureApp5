package com.example.ausrine.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        //Set up an Array for song list
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Bon Iver", "Holocene"));
        songs.add(new Song("Post Malone", "Congratulations"));
        songs.add(new Song("Manila Grey", "Disco Eyes"));
        songs.add(new Song("Fort Frances", "Summertime"));
        songs.add(new Song("Tank", "So Cold"));
        songs.add(new Song("GoldFish", "We Come Together"));
        songs.add(new Song("Raleigh Ritchie", "Stronger Than Ever"));
        songs.add(new Song("Yoav", "Where Is My Mind"));
        songs.add(new Song("The Decemberists", "Red Right Ankle"));
        songs.add(new Song("Panic at The Disco", "Death of a Bachelor"));
        songs.add(new Song("Leona Lewis", "Bleeding Love"));

        //Creating an adapter with the data source as the list of words
        SongAdapter songsAdapter = new SongAdapter(this, songs);
        //Finding ListView in the hierarchy
        ListView listView = (ListView) findViewById(R.id.musiclibrary);
        //Make Listview use the adapter created
        listView.setAdapter(songsAdapter);

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
