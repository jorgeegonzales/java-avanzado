package principle.solid.L;

import java.util.Objects;

public class HybridCar extends Vehiculo{
    @Override
    void accelerate() {
        powerSource(getSource());
    }

    @Override
    public void stop() {
        System.out.println("stopping the car with the regenerative braking system");
    }

    public void powerSource(String source) {
        if (Objects.equals("fuel",source)) {
            System.out.println("the source of energy is fuel");
            if (hasFuel(getFuel())){
                System.out.println("accelerating the car with the fuel");
            }else {
                System.out.println("I can not accelerate the car");
            }
        } else if (Objects.equals("battery",source)){
            System.out.println("the power source is the battery");
            if (hasBattery(getBattery())){
                System.out.println("accelerating the car with the battery");
            }else {
                System.out.println("I can not accelerate the car");
            }
        } else {
            System.out.println("the selected energy source does not correspond to a hybrid car");
        }
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
