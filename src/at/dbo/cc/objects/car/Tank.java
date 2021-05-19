package at.dbo.cc.objects.car;

public class Tank {

    private int fuelVolume;

    public Tank(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }
}
