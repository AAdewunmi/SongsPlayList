/**
 * Class Song: A class for creating song objects.
 * @author Ade Adewunmi
 * @version 30-4-2021
 */

public class Song {
    private String songTitle;
    private double songDuration;

    public Song(String songTitle, double songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return songTitle + ": " + songDuration;
    }
}
