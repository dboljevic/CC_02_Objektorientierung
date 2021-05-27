package at.dbo.cc.objects.camera;

import at.dbo.cc.objects.smartphone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDcard {

    private int capacity;
    private List<File> files;

    public SDcard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }


    // Methoden
    public void saveFile (File file){
        this.files.add(file);
    }

    public int checkMemory(){
        int sum = 0;
        for (File file : files) {
            sum += file.getSize();
        }
        return capacity - sum;
    }


    // Getter-Setter
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<File> getFiles() {
        return files;
    }
}
