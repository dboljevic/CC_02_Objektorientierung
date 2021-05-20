package at.dbo.cc.objects.sellCars;

import java.util.ArrayList;
import java.util.List;

public class Producer {

    private String name;
    private List<Car> cars = new ArrayList<>();
    private String countryOfOrigin;
    private int discount;

    public Producer(String name, String countryOfOrigin, int discount) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

public void addCars (Car car){
        this.cars.add(car);
}

    public List<Car> getCars() {
        return cars;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getDiscount() {
        return discount;
    }
}
