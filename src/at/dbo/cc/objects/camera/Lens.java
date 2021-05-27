package at.dbo.cc.objects.camera;

// Objektiv
public class Lens {

    public enum Manufacturer {CANON, NIKON}
    private Manufacturer manufacturer;
    private enum FocalDistance {ZOOM, NORMAL, WIDEANGLE}   // Brennweite: 85mm = Zoom, 50mm = normal, 24mm = Weitwinkel
    private FocalDistance focalDistance;

    public Lens(Manufacturer manufacturer) {
        this.focalDistance = focalDistance;
    }

    public File setFocalDistance(int focalDistance){
        File file = new File();
        if (focalDistance == 85){
            System.out.println("Setting lens to Zoom.... click");
            file.setSize(2);
        } else if (focalDistance == 24){
            System.out.println("Setting lens to wide-angle.... click");
            file.setSize(6);
        } else {
            System.out.println("Setting lens to normal.... click");
            file.setSize(4);
        }
        return file;
    }
}
