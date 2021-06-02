package at.dbo.cc.objects.musiker;

public class Musiker {

    private String name;
    private int alter;
    private Band band;
    private Song song;

    public Musiker(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.band = band;
    }

    public void singenSolo(){
        System.out.println("Dam di di dam, di di dam, ...");
    }

    public void singenRefrain (){
        System.out.println("We will, we will rock you");
    }



    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return name;
    }
}
