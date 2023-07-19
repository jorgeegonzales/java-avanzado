package principle.solid.l;


public class ElectricCar extends Vehiculo {
    @Override
    void accelerate() {
        if (hasBattery(getBattery())){
            System.out.println("accelerating the car with the battery");
        } else {
            System.out.println("I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        System.out.println("stopping the car with the regenerative braking system");
    }

    public boolean hasBattery(int battery) {
        System.out.println("checking battery");
        if (battery < 95) {
            System.out.println("the battery is very low :(");
            return false;
        } else {
            System.out.println("battery OK :)");
            return true;
        }
    }
}
