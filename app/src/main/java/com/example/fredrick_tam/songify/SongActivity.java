package com.example.fredrick_tam.songify;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;



public class SongActivity extends AppCompatActivity {
    private SongsMatches songs = new SongsMatches();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_song, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClickFindTrack(View view) {
        //Get a reference to the TextView
        TextView tracks = (TextView) findViewById(R.id.tracks);

        //Select spinner object
        Spinner color = (Spinner) findViewById(R.id.color);

        //Grab object spinner is on
        String genre = String.valueOf(color.getSelectedItem());

        //set textview to selected spinner object chosen
        //Get recommendations from the BeerExpert class
        List<String> songsList = songs.getTracks(genre);
        StringBuilder songsFormatted = new StringBuilder();
        for (String brand : songsList) {
            songsFormatted.append(brand).append('\n');
        }

        //Display the beers
        tracks.setText(songsFormatted);
    }
}
