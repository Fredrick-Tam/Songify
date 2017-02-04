package com.example.fredrick_tam.songify;

/**
 * Created by Fredrick-Tam on 2/3/17.
 */
import java.util.ArrayList;
import java.util.List;
import android.widget.TextView;
import android.widget.TextView;

public class SongsMatches {
        List<String> getTracks(String color) {
            List<String> tracks = new ArrayList<String>();
            if (color.equals("Hip-Hop")) {
                tracks.add("Bad and Boujee, Migos\n");
                tracks.add("Swang, Rae Sremmurd\n");
                tracks.add("Fake Love, Drake\n");
            } else if (color.equals("Pop"))  {
                tracks.add("Closer, Chainsmokers\n");
                tracks.add("Hide away, Daya\n");
                tracks.add("Let me love you, Justin Bieber\n");
            } else if (color.equals("RnB")) {
                tracks.add("So sick, Ne-Yo\n");
                tracks.add("I choose you, Mario\n");
            }
            return tracks;
        }
}
