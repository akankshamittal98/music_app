package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        Button library = findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(FavouritesActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
        Button singers = findViewById(R.id.singers);
        singers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent singIntent = new Intent(FavouritesActivity.this, SingersActivity.class);
                startActivity(singIntent);
            }
        });
        Button song = findViewById(R.id.play);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(FavouritesActivity.this, CurrentSongActivity.class);
                startActivity(songIntent);
            }
        });
        Button sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent subIntent = new Intent(FavouritesActivity.this, SubscribeActivity.class);
                startActivity(subIntent);
            }
        });
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(FavouritesActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
