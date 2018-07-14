package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SingersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singers);
        Button lib = findViewById(R.id.library);
        lib.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libIntent = new Intent(SingersActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        Button favourites = findViewById(R.id.favourites);
        favourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesIntent = new Intent(SingersActivity.this, FavouritesActivity.class);
                startActivity(favouritesIntent);
            }
        });
        Button sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent subIntent = new Intent(SingersActivity.this, SubscribeActivity.class);
                startActivity(subIntent);
            }
        });
        Button song = findViewById(R.id.play);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(SingersActivity.this, CurrentSongActivity.class);
                startActivity(songIntent);
            }
        });
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SingersActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
