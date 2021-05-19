package at.dbo.cc.objects.car;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type;  // Diesel oder Benzin
    private int fuelConsumption;

    public Engine(int horsePower, TYPE type, int fuelConsumption) {
        this.horsePower = horsePower;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive (int speed){
        System.out.println("speed is " + speed + " km/h");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
