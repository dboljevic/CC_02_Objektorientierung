package at.dbo.cc.objects.camera;

public class CameraMain {

    public static void main(String[] args) {

        Camera d500 = new Camera(Camera.Manufacturer.NIKON, 7);
        Lens l1 = new Lens(Lens.Manufacturer.NIKON);
        SDcard sdcard = new SDcard(64);

        d500.setLens(l1);
        d500.setCard(sdcard);

        d500.takePicture(85);
        d500.takePicture(85);
        d500.takePicture(50);
        d500.takePicture(24);
        d500.takePicture(24);

        d500.showAllPhotos();
        d500.showLastPhoto();

        d500.checkMemory();
    }
}
