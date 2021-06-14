package at.dbo.cc.objects.configuringCar;

public class Car {

    private Producer producer;
    private Engine engine;
    private String model;

    public Car(Producer producer, String model) {
        this.producer = producer;
        this.engine = engine;
        this.model = model;
    }


    // Getter - Setter

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

}
