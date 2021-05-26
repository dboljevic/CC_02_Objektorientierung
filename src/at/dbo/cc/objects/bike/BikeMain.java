package at.dbo.cc.objects.bike;

public class BikeMain {

    public static void main(String[] args) {
        Light frontL1 = new Light(COLOR.WHITE);
        Light backL1 = new Light(COLOR.RED);
        Bike b1 = new Bike();

        b1.setFrontLight(frontL1);
        b1.setBackLight(backL1);

        System.out.println(b1.getFrontLight().isOn());
        b1.getFrontLight().setOn(true);
        System.out.println(b1.getFrontLight().isOn());


        b1.addOwner("Daniel");
        b1.addOwner("Aleks");
        System.out.println(b1.getOwnerList());
        System.out.println(b1);
    }

}
