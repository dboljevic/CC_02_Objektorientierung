package at.dbo.cc.objects.smartphone;

public class Camera {

    public enum RESOLUTION {HD, FullHD, UHD}
    private RESOLUTION resolution;


    public Camera(RESOLUTION resolution) {
        this.resolution = resolution;
    }


    public PhoneFile makePicture(RESOLUTION resolution){
        PhoneFile file = new PhoneFile();
        System.out.println("Making picture .... snap");
        if (resolution == RESOLUTION.HD){
            file.setSize(2);
        } else if (resolution == RESOLUTION.FullHD){
            file.setSize(5);
        } else{
            file.setSize(10);
        }
        return file;
    }

    public PhoneFile makeSelfie(RESOLUTION resolution){
        PhoneFile file = new PhoneFile();
        System.out.println("Making selfie .... snap");
        if (resolution == RESOLUTION.HD){
            file.setSize(2);
        } else if (resolution == RESOLUTION.FullHD){
            file.setSize(5);
        } else{
            file.setSize(10);
        }
        return file;
    }
}
