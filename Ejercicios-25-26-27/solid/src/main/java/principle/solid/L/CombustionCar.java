package principle.solid.L;

public class CombustionCar extends Vehiculo {
    @Override
    void accelerate() {
        if (hasFuel(getFuel())){
            System.out.println("accelerating the car with the fuel");
        } else {
            System.out.println("I can not accelerate the car");
        }
    }

    @Override
    void stop() {
        System.out.println("stopping the car with the ABS braking system");
    }

    public boolean hasFuel(int fuel) {
        System.out.println("checking fuel");
        if (fuel < 0) {
            System.out.println("the fuel is very low :(");
            return false;
        } else {
            System.out.println("fuel OK :)");
            return true;
        }
    }
}
