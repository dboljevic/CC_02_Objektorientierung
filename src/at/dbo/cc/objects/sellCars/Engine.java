package at.dbo.cc.objects.sellCars;

public class Engine {

    private enum TYPE {DIESEL, GAS}
    private TYPE type;
    private int horsePower;

    public Engine(TYPE type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }
}
