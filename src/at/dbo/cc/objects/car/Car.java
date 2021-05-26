package at.dbo.cc.objects.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public class Car {
//    private Engine engine;
//
//    public startEngine() {
//        engine.start();
//    }
//}

public class Car {

    private Engine engine;
    private Tank tank;
    private int amountOfRepetitions;
    private String brand;
    private String serialNumber;
    private String color;
    private List<Tyre> tyres;
    private List<RearMirror> mirrors;


    // Konstruktor
    public Car (Engine engine, Tank tank, String brand, String color, String serialNumber, List<Tyre> tyres) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.serialNumber = serialNumber;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
        this.tyres = tyres;
    }

    // Methoden

    public void printTyreStatus(){
        for (Tyre tyre: this.tyres) {
            System.out.println("usage:" + tyre.getUsage());
        }
    }


    public void addMirror (RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public void drive(int speed) {
        System.out.println("I'm a " + this.brand + ", my color is " + this.color + ", my tank contains " + this.getTank().getFuelVolume() + "l and I've " + this.getEngine().getHorsePower() + " PS");

        getEngine().drive(speed);

    }


    public int getFuelLevel(int drivenKM) {
        int fuelKM = getTank().getFuelVolume() * 100 / getEngine().getFuelConsumption();

        int fuelLevel = (fuelKM - drivenKM) * getEngine().getFuelConsumption() / 100;
        return fuelLevel;
    }

    public int getFuelPercentage(int drivenKM) {
        int fuelLevel = getFuelLevel(drivenKM);
        return 100 * fuelLevel / getTank().getFuelVolume();
    }

    public int getRemainingRange() {
        return getTank().getFuelVolume() * 100 / getEngine().getFuelConsumption();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) && Objects.equals(tank, car.tank) && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, tank, brand, color);
    }


    // Getter & Setter

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }

    public void setTyres(List<Tyre> tyres) {
        this.tyres = tyres;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }



}
