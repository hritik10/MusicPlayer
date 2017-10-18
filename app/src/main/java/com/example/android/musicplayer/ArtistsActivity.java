package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        TextView song = (TextView) findViewById(R.id.songs);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.playlists);
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView player = (TextView) findViewById(R.id.player);
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player_ui View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(playerIntent);
            }
        });
    }
}
