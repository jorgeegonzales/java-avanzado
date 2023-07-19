package principle.solid.l;

public class Vehiculo extends AbstractVehiculo{

    @Override
    void accelerate() {
        System.out.println("accelerating the car");
    }

    @Override
    void stop() {
        System.out.println("stopping the car");
    }
}
