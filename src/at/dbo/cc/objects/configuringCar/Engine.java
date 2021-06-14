package at.dbo.cc.objects.configuringCar;

public class Engine {

    private EngineType type;
    private int horsePower;

    enum EngineType{
        Diesel, Benzin, Hybrid
    }

    public Engine(EngineType type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }


    // Getter - Setter

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
