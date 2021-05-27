package at.dbo.cc.objects.camera;

import java.util.List;
import java.util.Random;

public class Camera {

    public enum Manufacturer {CANON, NIKON}
    private Manufacturer manufacturer;
    private int megapixels;
    private SDcard card;
    private Lens lens;


    public Camera(Manufacturer manufacturer, int megapixels) {
        this.manufacturer = manufacturer;
        this.megapixels = megapixels;
        this.card = card;
        this.lens = lens;
    }

    // Methoden
    /**
     * Stelle das Objektiv ein, bevor du ein Foto machst
     * @param focalDistance
     */
    public void takePicture(int focalDistance){
        File file = this.lens.setFocalDistance(focalDistance);
        file.setName("pic_" + (new Random().nextInt(5000 - 1000)));
        file.setExtension(".jpg");
        card.saveFile(file);
    }

    public void showLastPhoto(){
        List<File> files = getCard().getFiles();
        System.out.println(files.get(files.size()-1));
    }

    public void showAllPhotos(){
        System.out.println(getCard().getFiles());
    }

    public void checkMemory (){
        System.out.println("Freier Speicher: " + getCard().checkMemory() + " MB");
    }


    // Getter-Setter
    public Manufacturer getManufacturer() {
        return manufacturer;
    }


    public int getMegapixels() {
        return megapixels;
    }


    public SDcard getCard() {
        return card;
    }

    public void setCard(SDcard card) {
        this.card = card;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }
}
