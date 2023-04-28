package org.howard.edu.lsp.finals.problem;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class SongsDatabaseTest {

    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
        assertEquals(db.map.get("Rap"), new HashSet<String>() {private static final long serialVersionUID = 1L;

		{
            add("Savage");
            add("Gin and Juice");
        }});
        assertEquals(db.map.get("Jazz"), new HashSet<String>() {private static final long serialVersionUID = 1L;

		{
            add("Always There");
        }});
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
        Set<String> songs = db.getSongs("Rap");
        assertEquals(songs, new HashSet<String>() {private static final long serialVersionUID = 1L;

		{
            add("Savage");
            add("Gin and Juice");
        }});
        songs = db.getSongs("Jazz");
        assertEquals(songs, new HashSet<String>() {private static final long serialVersionUID = 1L;

		{
            add("Always There");
        }});
    }

    
    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
        assertEquals(db.getGenreOfSong("Savage"), "Rap");
        assertEquals(db.getGenreOfSong("Always There"), "Jazz");
    }
}
