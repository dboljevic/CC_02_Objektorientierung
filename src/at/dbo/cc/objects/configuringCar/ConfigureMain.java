package at.dbo.cc.objects.configuringCar;

/*
Lasse über eine Konsolenanwendung den Benutzer ein Auto konfigurieren.

Sprich, er kann auswählen ob er z.B. die 100 PS Version oder die 200 PS Version möchte, aber auch ob es ein Diesel oder Benziner ist. Je nach Auswahl wird ein anderer Gesamtpreis errechnet, da Modifikationen ja unterschiedlich kosten.

Wenn der Benutzer fertig konfiguriert hat, so wollen wir die Rechnungsdaten auf der Konsole ausgeben. In CSV Format.

BMW X3; Diesel; 200; 50.000
AUDI A4; Benzin; 220; 60.000
 */

import java.util.Arrays;

public class ConfigureMain {

    public static void main(String[] args) {

        // Einige Autohersteller erstellen
        Producer audi = new Producer("Audi", Arrays.asList(50, 110, 140));
        Producer bmw = new Producer("BMW",  Arrays.asList(95, 130, 220));
        Producer skoda = new Producer("Skoda", Arrays.asList(90, 120, 150));

        // Audis erstellen
        Car a1 = new Car(audi, "A1");
        Car a3 = new Car(audi, "A3");
        Car a4 = new Car(audi, "A4");
        Car a6 = new Car(audi, "A6");

        // BMWs erstellen
        Car x1 = new Car(bmw, "x1");
        Car i3 = new Car(bmw, "i3");
        Car bmw5 = new Car(bmw, "5er");

        // Skodas erstellen
        Car fabia = new Car(skoda, "Fabia");
        Car octavia = new Car(skoda, "Octavia");
        Car superb = new Car(skoda, "Superb");
        Car kodiaq = new Car(skoda, "Kodiaq");

        // Autos den jeweiligen Herstellern zufügen
        audi.addCar(a1);
        audi.addCar(a3);
        audi.addCar(a4);
        audi.addCar(a6);
        bmw.addCar(x1);
        bmw.addCar(i3);
        bmw.addCar(bmw5);
        skoda.addCar(fabia);
        skoda.addCar(octavia);
        skoda.addCar(superb);
        skoda.addCar(kodiaq);


        GUI gui = new GUI();

        gui.addProducer(audi);
        gui.addProducer(bmw);
        gui.addProducer(skoda);

        gui.showGUI();
    }
}
