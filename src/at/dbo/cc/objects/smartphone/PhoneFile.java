package at.dbo.cc.objects.smartphone;

public class PhoneFile {

    private String extension;
    private int size;
    private String name;

    public PhoneFile() {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

//    public void getInfo(){
//        System.out.println("Name: " + this.name + " / Grösse: " + this.size + " / Dateityp: ." + this.extension);
//    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneFile{" +
                "extension = " + extension +
                ", size = " + size + "MB" +
                ", name = " + name +
                '}' + "\n";
    }
}
