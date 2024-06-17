package Day9;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void listCars() {
        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }
}
