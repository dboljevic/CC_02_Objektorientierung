package at.dbo.cc.objects.configuringCar;

import java.util.ArrayList;
import java.util.List;

public class Producer {

    private String name;
    private List<Car> cars;
    private List<Integer> horsePowerList;

    public Producer(String name, List<Integer> possiblePsValues) {
        this.name = name;
        this.cars = new ArrayList<>();
        this.horsePowerList = possiblePsValues;
    }


    // Getter - Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public List<Integer> getHorsePowerList(){
        return horsePowerList;
    }

    public void setHorsePower(List<Integer> horsePowerList){
        this.horsePowerList = horsePowerList;
    }

    public void addHorsePower(Integer horsePower){
        this.horsePowerList.add(horsePower);
    }

}
