package at.dbo.cc.objects.car;

import java.util.ArrayList;
import java.util.List;

public class TyreFactory {

    public static List<Tyre> getTyres(Tyre.TYPE type, int inches, int amount){
        List<Tyre> tyres = new ArrayList<>();
        int  dimension = inches;
        for (int i = 0; i < amount; i++) {
            if (type == Tyre.TYPE.SUMMER){
                 Tyre createTyre = new Tyre(Tyre.TYPE.SUMMER, 205, dimension);
                 tyres.add(createTyre);
            } else {
                Tyre createTyre = new Tyre(Tyre.TYPE.WINTER, 195, dimension);
                tyres.add(createTyre);
            }
        }
        return tyres;
    }

}
