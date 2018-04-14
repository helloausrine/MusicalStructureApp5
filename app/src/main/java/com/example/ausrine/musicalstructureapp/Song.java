package com.example.ausrine.musicalstructureapp;

public class Song {

    private String mArtistName;

    private String mSongName;

    public Song(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getSongName() {
        return mSongName;
    }
}
