package at.dbo.cc.objects.smartphone;

import java.util.ArrayList;
import java.util.List;

public class SDcard {

    private int capacity;
    private List<PhoneFile> files;

    public SDcard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void saveFile (PhoneFile file){
        this.files.add(file);
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public int checkFreeSpace(){
        int sum = 0;
        for (PhoneFile file : files) {
            sum += file.getSize();
        }
        return capacity - sum;
    }

}
