package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView song = (TextView) findViewById(R.id.songs);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artists);
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.playlists);
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView player = (TextView) findViewById(R.id.player);
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player_ui View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(playerIntent);
            }
        });
    }
}