package Day9;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addCar(new Car("AA","AA1",2022));
        garage.addCar(new Car("BB","BB1",2023));
        garage.addCar(new Car("CC","BB1",2024));

        garage.listCars();
    }
}
