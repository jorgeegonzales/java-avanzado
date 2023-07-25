package principle.solid.D.car.dependency_inversion;

import principle.solid.D.car.interface_segregation.CarBehavior;

public interface ConexionCar extends CarBehavior {
    Car getCar();
    void setCar(Car car);

}
