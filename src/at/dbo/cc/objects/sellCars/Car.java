package at.dbo.cc.objects.sellCars;

public class Car {

    private String color;
    private int maxSpeed;
    private int salePrice;
    private double fuelConsumption;
    private String name;
    private Producer producer;
    private Engine engine;

    public Car(Producer producer, String name, int salePrice) {
        this.producer = producer;
        this.name = name;
        this.salePrice = salePrice;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getName(){
        return name;
    }

    public Producer getProducer() {
        return producer;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +

                ", salePrice=" + salePrice +
                ", fuelConsumption=" + fuelConsumption +
                ", name='" + name + '\'' +
                ", producer=" + producer +
                ", engine=" + engine +
                '}';
    }
}
