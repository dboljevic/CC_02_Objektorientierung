package at.dbo.cc.objects.remote;

/*
Aufgabe - Mini Projekt Fernbedienung
Erstelle ein neues Package at.xxx.projects.remote. Setze dort folgendes UML Diagramm um.
Eine Fernbedienung hat 2 Batterien. Über die Methode getStatus() bekommt man den Ladesatatus (in Volt + %).
Dazu muss die Fernbedienung die Batterien nach dem aktuellen Status befragen und den Mittelwert zurückliefern.
Eine neue Batterie hat die Spannung 3.5 Volt.

Wenn auf der Fernbedienung die Methode "selectChannel(int number)" gedrückt wird, verliert jede Batterie 0.3 Volt an Spannung.
 */

public class RemoteMain {

    public static void main(String[] args) {

        Battery b1 = new Battery();
        Battery b2 = new Battery();

        Remote r1 = new Remote();
        r1.addBattery(b1);
        r1.addBattery(b2);

        System.out.println("Status der Batterien: " + r1.getStatus() + " Volt (entspricht " + r1.getVoltagePercentage() + "%)");


        r1.selectChannel(3);

        System.out.println("Status der Batterien: " + r1.getStatus() + " Volt (entspricht " + r1.getVoltagePercentage() + "%)");

    }


}
