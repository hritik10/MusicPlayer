package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView artist = (TextView) findViewById(R.id.artists);
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.playlists);
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(SongsActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView player = (TextView) findViewById(R.id.player);
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player_ui View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(playerIntent);
            }
        });
    }
}
