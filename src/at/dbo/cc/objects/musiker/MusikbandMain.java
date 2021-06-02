package at.dbo.cc.objects.musiker;

public class MusikbandMain {

    public static void main(String[] args) {

        Band band = new Band("Queen");
        Saenger saenger = new Saenger("Freddie Mercury", 45);
        Gitarrist gitarrist = new Gitarrist("Brian May", 47);
        Schlagzeuger schlagzeuger = new Schlagzeuger("Roger Taylor", 42);
        Bassist bassist = new Bassist("John Deacon", 40);

        band.addBandmitglied(saenger);
        band.addBandmitglied(gitarrist);
        band.addBandmitglied(schlagzeuger);
        band.addBandmitglied(bassist);

        System.out.println("Frontman der Band " + band.getName() + " = " + band.getMitglieder().get(0));

        Song song = new Song("Bohemian Rhapsody");
        Song song1 = new Song("Another bites the dust");
        Song song2 = new Song("We will Rock You");
        Song song3 = new Song("Radio Ga Ga");
        band.addSong(song);
        band.addSong(song1);
        band.addSong(song2);
        band.addSong(song3);

        System.out.println(band.getName() + "s erster Nr. 1 Hit war " + band.getSongs().get(0));
        //System.out.println("Weitere Titel: " + band.getSongs().get(1) + ", " + band.getSongs().get(2) + ", " + band.getSongs().get(3));
        band.getMoreSongs();
        band.getCast();
        System.out.println(band.getMitglieder());

        machtMusik(saenger, gitarrist, schlagzeuger, bassist);
        singenRefrain(saenger, gitarrist, schlagzeuger, bassist);
    }

    public static void machtMusik(Musiker... mitglieder){
        for (Musiker mitglied: mitglieder) {
            System.out.print(mitglied + ": ");
            mitglied.singenSolo();
        }
    }

    public static void singenRefrain(Musiker... mitglieder){
        for (Musiker mitglied: mitglieder) {
            mitglied.singenRefrain();
        }
    }
}
