package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubscribeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);
        Button lib = findViewById(R.id.library);
        lib.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libIntent = new Intent(SubscribeActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        Button fav = findViewById(R.id.favourites);
        fav.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(SubscribeActivity.this, FavouritesActivity.class);
                startActivity(favIntent);
            }
        });
        Button sing = findViewById(R.id.singers);
        sing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent singIntent = new Intent(SubscribeActivity.this, SingersActivity.class);
                startActivity(singIntent);
            }
        });
        Button song = findViewById(R.id.play);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(SubscribeActivity.this, CurrentSongActivity.class);
                startActivity(songIntent);
            }
        });
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SubscribeActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
