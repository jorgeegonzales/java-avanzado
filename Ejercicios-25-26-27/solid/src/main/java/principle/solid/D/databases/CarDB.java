package principle.solid.D.databases;

import principle.solid.D.car.dependency_inversion.Car;

import java.util.ArrayList;

public class CarDB {
    private ArrayList<Car> carDataBase = new ArrayList<>();

    public ArrayList<Car> getCarDataBase() {
        return carDataBase;
    }

    public void setCarDataBase(ArrayList<Car> carDataBase) {
        this.carDataBase = carDataBase;
    }

    @Override
    public String toString() {
        return "CarDB{" +
                "carDataBase=" + carDataBase +
                '}';
    }
}
