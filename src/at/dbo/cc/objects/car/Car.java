package at.dbo.cc.objects.car;

public class Car {

    //*** Instanz bzw. Gedächtnisvariablen bzw. Attribute ***

    // das public dient nur zu Testzwecken und sollte in Zukunft nicht verwendet werden
    public int fuelConsumption;
    public int fuelVolume;
    public int amountOfRepetitions;
    private String brand;
    public String serialNumber;


    // Methoden
    public void drive (){
        int fuelLevel = this.fuelVolume - this.fuelConsumption;
        System.out.println("I'm driving home for Christmas");
    }


    public String brake (){
        String brake = "I brake";
        return brake;
    }


    public String turboBoost() {

        String turboBoost = "SuperBoostMode!";
        String noBoost = "Not enough fuel to to SuperBoost";

        int fuelLevel = this.fuelVolume - this.fuelConsumption;

        int fuelVolumePercent = 100 * fuelLevel / this.fuelVolume;

        if (fuelVolumePercent > 10) {
            return turboBoost;
        } else {
            return noBoost;
        }

    }


    public int honk (int amountOfRepetitions){
        for (int i = amountOfRepetitions; i > 0 ; i--) {
            System.out.print("Tuuut! ");
        }
        System.out.println("");
        return amountOfRepetitions;
    }


    public int getRemainingRange(){
        return this.fuelVolume * 100 / this.fuelConsumption;
    }



}
