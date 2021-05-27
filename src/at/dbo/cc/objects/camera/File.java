package at.dbo.cc.objects.camera;

public class File {

    private String extension;
    private int size;
    private String name;

    public File() {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }


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
        return "File{" +
                "Dateityp: " + extension +
                ", Grösse: " + size + "MB" +
                ", " + name +
                '}' + "\n";
    }
}
