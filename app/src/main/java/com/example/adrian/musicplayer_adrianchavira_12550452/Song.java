package com.example.adrian.musicplayer_adrianchavira_12550452;

import java.util.StringTokenizer;

/**
 * Created by Adrian on 06/12/2017.
 */

class Song {
    private long id;
    private String title;
    private String artist;

    public Song(Long songID, String songTitle, String songArtist){
        id = songID;
        title = songTitle;
        artist = songArtist;
    }

    public long getID() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}


