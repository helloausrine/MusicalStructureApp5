package com.example.ausrine.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.library_item, parent, false);
        }

        // Get the object located at this position in the list
        Song currentSong = getItem(position);

        // Find the artist TextView in the hierarchy
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name
        miwokTextView.setText(currentSong.getArtistName());

        // Find the song TextView in the hierarchy
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the song name
        defaultTextView.setText(currentSong.getSongName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
