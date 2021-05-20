package at.dbo.cc.objects.sellCars;

/*
Aufgabe Autos

Ein Auto hat eine Farbe, eine Maximalgeschwindigkeit, einen Basispreis, Basisverbrauch und einen Hersteller und einen Motor.  Der Hersteller hat einen Namen und ein Herkunftsland. Jeder Hersteller gibt einen gewissen Rabatt. Dieser ist unterschiedlich je nach Hersteller. Der Rabatt wird in Prozent angegeben. Der Motor ist entweder Diesel oder Benzin und hat eine Leistung.

Der Preis berechnet sich durch den Abzug des Rabatts vom Basispreis.

Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch. Danach wird er um 9.8 Prozent höher.
 */

public class MainSellCars {

    public static void main(String[] args) {

        // Car p1 = peugeot.produce(30_000);

        Producer audi = new Producer("Audi","DE", 20);
        Producer toyota = new Producer("Toyota","JP", 25);
        Producer peugeot = new Producer("Peugeot", "FR", 30);

        Car a1 = new Car(audi, "A4", 35_000);
        Car t1 = new Car(toyota, "Yaris", 20_000);
        Car p1 = new Car(peugeot, "Peugeot 308", 30_000);

        Car a2 = new Car(audi, "A3", 30_000);

        audi.addCars(a1);
        audi.addCars(a2);

        System.out.println("Was kostet der " + a1.getName() + "?");
        System.out.println(a1.getSalePrice());

        System.out.println("Was kostet der " + a2.getName() + "?");
        System.out.println(a2.getSalePrice());

        System.out.println("Gibt's einen Rabatt für die Audis?");
        System.out.println(a1.getProducer().getDiscount() + "%");
        System.out.println(a1.getSalePrice() * a1.getProducer().getDiscount()/ 100 + "EUR für den " + a1.getName());
        System.out.println(a2.getSalePrice() * a2.getProducer().getDiscount()/ 100 + "EUR für den " + a2.getName());

        System.out.println("Woher kommt Toyota eigentlich?");
        System.out.println(toyota.getCountryOfOrigin());

        //System.out.println(audi.getCars().get(1));
    }

}
