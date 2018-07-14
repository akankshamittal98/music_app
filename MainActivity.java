package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout library = findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libintent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libintent);
            }
        });

        LinearLayout favourites = findViewById(R.id.favourites);
        favourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favintent = new Intent(MainActivity.this, FavouritesActivity.class);
                startActivity(favintent);
            }
        });

        LinearLayout singers = findViewById(R.id.singers);
        singers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent singintent = new Intent(MainActivity.this, SingersActivity.class);
                startActivity(singintent);
            }
        });

        LinearLayout sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent subintent = new Intent(MainActivity.this, SubscribeActivity.class);
                startActivity(subintent);
            }
        });

        LinearLayout song = findViewById(R.id.play);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songintent = new Intent(MainActivity.this, CurrentSongActivity.class);
                startActivity(songintent);
            }
        });


    }
}
