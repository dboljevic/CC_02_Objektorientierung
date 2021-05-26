package at.dbo.cc.objects.smartphone;

public class SIMcard {

    private int id;
    private String number;

    public SIMcard(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall (String number){
        System.out.println("Calling... " + number);
    }
}
