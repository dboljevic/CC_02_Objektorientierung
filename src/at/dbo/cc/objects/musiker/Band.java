package at.dbo.cc.objects.musiker;

import java.util.ArrayList;
import java.util.List;

public class Band {

    private String name;
    private List<Musiker> mitglieder;
    private List<Song> songs;

    public Band (String name){
        this.name = name;
        this.mitglieder = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addBandmitglied (Musiker mitglied){
        this.mitglieder.add(mitglied);
    }

    public void addSong (Song song){
        this.songs.add(song);
    }

    public void getMoreSongs(){
        List<Song> songs = getSongs();
            for (int i = 1; i < songs.size(); i++) {
            System.out.println("Weitere Titel: " + getSongs().get(i));
            }
    }

    public void getCast(){
        List<Musiker> mitglieder = getMitglieder();
        System.out.print("Mitglieder der Band: ");
        for (int i = 0; i < mitglieder.size(); i++) {
            System.out.print(getMitglieder().get(i) + ", ");
        }
        System.out.println("");
    }

    public List<Musiker> getMitglieder() {
        return mitglieder;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", mitglieder=" + mitglieder +
                ", songs=" + songs +
                '}';
    }
}
