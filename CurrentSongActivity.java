package com.example.android.music_app;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);
        Button lib = findViewById(R.id.library);
        lib.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libIntent = new Intent(CurrentSongActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        Button fav = findViewById(R.id.favourites);
        fav.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(CurrentSongActivity.this, FavouritesActivity.class);
                startActivity(favIntent);
            }
        });
        Button sing = findViewById(R.id.singers);
        sing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent singIntent = new Intent(CurrentSongActivity.this, SingersActivity.class);
                startActivity(singIntent);
            }
        });
        Button sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent subIntent = new Intent(CurrentSongActivity.this, SubscribeActivity.class);
                startActivity(subIntent);
            }
        });
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(CurrentSongActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
