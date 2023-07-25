package principle.solid.I.car.dependency_inversion;

import principle.solid.I.car.interface_segregation.CarBehavior;

public interface ConexionCar extends CarBehavior {
    Car getCar();
    void setCar(Car car);

}
