package at.dbo.cc.objects.configuringCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {
    private List<Producer> producerList = new ArrayList<>();
    //private List<Engine> engines = new ArrayList<>();
    private Scanner scanner;

    public GUI() {
        this.scanner = new Scanner(System.in);
    }

    public void showGUI() {

        Car configuredCar = new Car(null, null);

        System.out.println("Unser Angebot:");
        for (int i = 0; i < this.producerList.size(); i++) {
            System.out.println(i + ": " + producerList.get(i).getName());
        }
        System.out.println("Welche Automarke darf es sein?");
        int selection = scanner.nextInt();
        configuredCar.setProducer(producerList.get(selection)); // set producer

        List<Car> cars = producerList.get(selection).getCars();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + ": " + cars.get(i).getModel());
        }
        System.out.println("Welches Modell?");
        selection = scanner.nextInt();
        configuredCar.setModel(cars.get(selection).getModel()); // set model

        int cnt=0;
        for (Engine.EngineType type : Engine.EngineType.values()) {
            System.out.println(cnt + ": " + type);
            cnt++;
        }

        System.out.println("Welcher Motor soll es sein?");
        int engineSelection = scanner.nextInt();

        List<Integer> hps = configuredCar.getProducer().getHorsePowerList();
        for (int i = 0; i < hps.size(); i++) {
            System.out.println(i + ": " + hps.get(i));
        }

        System.out.println("Wieviele PS dürfen es sein?");
        int psSelection = scanner.nextInt();

        // Motor erstellen + setzen
        Engine newEngine = new Engine(Engine.EngineType.values()[engineSelection], hps.get(psSelection));
        configuredCar.setEngine(newEngine);


        System.out.println("Ihr gewähltes Modell:");
        System.out.println(configuredCar.getProducer().getName());
        System.out.println(configuredCar.getModel());
        System.out.println(configuredCar.getEngine().getType());
        System.out.println(configuredCar.getEngine().getHorsePower() + " PS");

    }

    public void addProducer(Producer producer) {
        this.producerList.add(producer);
    }

}
