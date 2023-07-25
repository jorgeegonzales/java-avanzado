package principle.solid.D.databases;

import principle.solid.D.car.dependency_inversion.Car;

public interface Conexion {
    CarDB getDataBase();
    void setDatos(CarDB carDB);

    void saveCar (Car car);
    void deleteCar(Car car);
}
