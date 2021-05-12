package at.dbo.cc.objects.car;

import java.util.Scanner;

public class CarRefactored {

    private int fuelConsumption;
    private int fuelVolume;
    private int amountOfRepetitions;
    private String brand;
    private String serialNumber;
    private String color;

    public CarRefactored (String brand, String serialNumber, int fuelVolume, int fuelConsumption){
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelVolume = fuelVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelLevel (int drivenKM){
        int fuelKM = this.fuelVolume * 100 / this.fuelConsumption;

        int fuelLevel = (fuelKM - drivenKM) * this.fuelConsumption / 100;
        return fuelLevel;
    }

    public int getFuelPercentage (int drivenKM){
        int fuelLevel = getFuelLevel(drivenKM);
        return 100 * fuelLevel / this.fuelVolume;
    }


    /* Verwendung von Getter und Setter

    Merke: Setter werden nicht für Attribute verwendet, welche NICHT im Nachhinein verändert werden sollen (z.B. Brand oder serialNumber)

     */


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {               // sollte theoretisch gar nicht erstellt werden
        this.brand = brand;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
