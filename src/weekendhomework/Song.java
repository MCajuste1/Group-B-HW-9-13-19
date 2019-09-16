package weekendhomework;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;


    }

    public void setTitle(String title) {
        // set this song title to the title given
        this.title = title;


    }

    public void play() {
        System.out.println("The track" + title + "is playing....");

    }

    public String favoriteTrack(String[] trackTitles) {
        // ".length" represents values, [] represents the array and your returning the values but -2
        return trackTitles[trackTitles.length -2];




    }












}
