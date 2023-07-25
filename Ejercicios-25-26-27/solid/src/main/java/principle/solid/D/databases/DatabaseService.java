package principle.solid.D.databases;

import principle.solid.D.car.dependency_inversion.Car;

public class DatabaseService implements Conexion {

    private CarDB carDB = new CarDB();

    @Override
    public CarDB getDataBase() {
        return carDB;
    }

    @Override
    public void setDatos(CarDB carDB) {
        this.carDB = carDB;
    }

    @Override
    public void saveCar(Car car) {
        carDB.getCarDataBase().add(car);
    }

    @Override
    public void deleteCar(Car car) {
        carDB.getCarDataBase().remove(car);
    }
}


