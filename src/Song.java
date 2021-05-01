/**
 * Class Song
 * Section 9: LinkedList Challenge (Part 1, 2 & 3)
 * Java Programming Masterclass for Software Developers
 * Created by Tim Buchalka (Tim Buchalka's Learn Programming Academy - Udemy)
 * https://www.udemy.com/course/java-the-complete-java-developer-course/
 */

public class Song {
    private final String songTitle;
    private final double songDuration;

    public Song(String songTitle, double songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return this.songTitle + ": " + this.songDuration;
    }
}
