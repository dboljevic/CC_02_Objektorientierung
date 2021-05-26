package at.dbo.cc.objects.bike;

import java.util.ArrayList;

public class Bike {

    private Light frontLight;
    private Light backLight;

    private ArrayList<String> ownerList = new ArrayList<>();



    public Light getFrontLight() {
        return frontLight;
    }

    /**
     * setzt das vordere licht
     * @param frontLight
     */
    public void setFrontLight(Light frontLight) {
        this.frontLight = frontLight;
    }

    public Light getBackLight() {
        return backLight;
    }

    public void setBackLight(Light backLight) {
        this.backLight = backLight;
    }

    /**
     * fügt einen neuen Besitzer hinzu
     * @param name
     */
    public void addOwner (String name){
        ownerList.add(name);
    }

    public ArrayList<String> getOwnerList() {
        return ownerList;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frontLight=" + frontLight +
                ", backLight=" + backLight +
                ", ownerList=" + ownerList +
                '}';
    }
}
