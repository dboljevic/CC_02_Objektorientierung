package at.dbo.cc.objects.smartphone;

public class PhoneMain {

    public static void main(String[] args) {

        SIMcard sim = new SIMcard(123, "0650 6623 453");
        SDcard sd = new SDcard(64_000);

        Smartphone p30 = new Smartphone("pacific blue");
        p30.setSim(sim);
        p30.setCard(sd);

        /*
        Hier könnte man das Tel. im Nachhinein noch mit einer besseren Kamera nachrüsten
        Camera topCamera = new Camera(Camera.RESOLUTION.UHD);
        p30.setMainCamera(topCamera);
         */

        //System.out.println(c4.getMirrors().get(1).getPosition());
        System.out.println("Farbe des Telefons: " + p30.getColor());
        System.out.println("Kapazität des Telefons: " + p30.getCard().getCapacity() + " MB");
        p30.takePicture();
        p30.takePicture();
        p30.takeSelfie();
        p30.printAllFiles();

        p30.makeCall("0677 615 97097");

        p30.checkFreeSpace();


    }
}
