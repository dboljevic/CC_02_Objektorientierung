package at.dbo.cc.objects.car;

import java.util.Scanner;

public class CarMain {

    // Car
    /*public static void main(String[] args) {

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


    }*/


    // Car refactored
    public static void main(String[] args) {

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

    }
}:
