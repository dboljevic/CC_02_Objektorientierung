package at.dbo.cc.objects.car;

import java.util.List;

public class CarMain {

    public static void main(String[] args) {

        // Car - erste Schritte
    /*

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 8;
        c1.serialNumber = "A1234";
        c1.fuelVolume = 50;
        c1.amountOfRepetitions = 2;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 7;
        c2.serialNumber = "B1234";
        c2.fuelVolume = 35;
        c2.amountOfRepetitions = 3;



        System.out.println(c2.fuelVolume);
        c2.drive();
        System.out.println(c2.brake());


        System.out.println("---------------------------------------------------------");


        System.out.println("Driver c1: " + c1.brand);
        c1.drive();
        System.out.println(c1.turboBoost());

        System.out.println("---------------------------------------------------------");

        c2.honk(c2.amountOfRepetitions);

        System.out.println("---------------------------------------------------------");

        System.out.println(c1.getRemainingRange() + " km");
*/

        // Car refactored
    /*
        CarRefactored c3 = new CarRefactored("Toyota", "T1000", 60, 6);
        System.out.println(c3.getBrand());

        c3.setBrand("AUDI");
        System.out.println(c3.getBrand());

        c3.setColor("yellow");
        System.out.println(c3.getBrand() + " has changed color to " + c3.getColor());

        System.out.println("Wieviel km bist du gefahren?");
        Scanner scanner = new Scanner(System.in);
        int drivenKM = scanner.nextInt();
        System.out.println(c3.getFuelLevel(drivenKM) + "l noch im Tank.");
        System.out.println("Das sind " + c3.getFuelPercentage(drivenKM) + "%");
*/


        // Car mit Motor, Tank, Reifen, etc.
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 6);
        Tank t1 = new Tank(60);

        RearMirror r1 = new RearMirror(10, 0);
        RearMirror r2 = new RearMirror(15, -20);
        RearMirror r3 = new RearMirror(15, 20);

        List<Tyre> tyres = TyreFactory.getTyres(Tyre.TYPE.SUMMER, 16,4);


        Car c4 = new Car(e1, t1, "Audi", "blue","A1234", tyres);
        c4.drive(50);
        c4.addMirror(r1);
        c4.addMirror(r2);
        c4.addMirror(r3);
        System.out.println("Der Spiegel r2 befindet sich " + c4.getMirrors().get(1).getPosition());

        c4.printTyreStatus();


        Car c5 = new Car(e1, t1, "Audi", "blue","A12345", tyres);

        // Methode EQUALS testen
        if (c4.equals(c5)){
            System.out.println("Die Autos sind gleich");
        } else{
            System.out.println("Die Autos sind unterschiedlich");
        }



    }

}
