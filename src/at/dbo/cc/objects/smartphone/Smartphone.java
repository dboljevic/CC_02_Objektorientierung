package at.dbo.cc.objects.smartphone;

import java.util.Date;

public class Smartphone {

    private String color;
    private Camera frontCamera;
    private Camera mainCamera;
    private SIMcard sim;
    private SDcard card;


    public Smartphone(String color) {
        this.color = color;
        this.frontCamera = new Camera(Camera.RESOLUTION.HD);
        this.mainCamera = new Camera(Camera.RESOLUTION.FullHD);
        this.sim = sim;
        this.card = card;
    }

// Methoden

    public void takePicture() {
        if(this.card == null || this.card.checkFreeSpace()<1000){
            System.out.println("Kein Platz oder keine Karte");
            return;
        }
        PhoneFile file = this.mainCamera.makePicture(Camera.RESOLUTION.FullHD);
        file.setName("pic-" + (new Date()).getTime());
        file.setExtension(".jpg");
        card.saveFile(file);
    }

    public void takeSelfie() {
        if(this.card == null || this.card.checkFreeSpace()<1000){
            System.out.println("Kein Platz oder keine Karte");
            return;
        }
        PhoneFile file = this.frontCamera.makeSelfie(Camera.RESOLUTION.HD);
        file.setName("picture-" + (new Date()).getTime());
        file.setExtension(".jpg");
        card.saveFile(file);
    }

    public void makeCall(String number){
        if (sim == null){
            System.out.println("Keine SIM im Telefon");
            return;
        }
        sim.doCall(number);
    }

    public void checkFreeSpace (){
        System.out.println("Restkapazität des Telefons beträgt: " + getCard().checkFreeSpace() + " MB");
    }

    public void printAllFiles(){
        System.out.println(getCard().getFiles());
    }


// Getter & Setter

    public Camera getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(Camera frontCamera) {
        this.frontCamera = frontCamera;
    }


    public Camera getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(Camera mainCamera) {
        this.mainCamera = mainCamera;
    }


    public SIMcard getSim() {
        return sim;
    }

    public void setSim(SIMcard sim) {
        this.sim = sim;
    }


    public SDcard getCard() {
        return card;
    }

    public void setCard(SDcard card) {
        this.card = card;
    }

    public String getColor() {
        return color;
    }

}
