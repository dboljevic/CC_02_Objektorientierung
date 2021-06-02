package at.dbo.cc.objects.musiker;

public class Song {

    private String song;

    public Song(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return song;
    }
}
