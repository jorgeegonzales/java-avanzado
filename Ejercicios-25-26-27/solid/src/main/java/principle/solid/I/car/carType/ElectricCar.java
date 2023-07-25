package principle.solid.I.car.carType;

import principle.solid.I.car.dependency_inversion.Vehiculo;

import java.util.Objects;

public class ElectricCar extends Vehiculo {
    private int battery;

    private String optionSource;

    public ElectricCar(){
        System.out.println("ELECTRIC CAR");
        System.out.println("================================================");
    }

    @Override
    public int getSource() {
        return battery;
    }

    @Override
    public void setSource(int source) {
        this.battery = source;
    }

    @Override
    public String getOptionSource() {
        return optionSource;
    }

    @Override
    public void setOptionSource(String optionSource) {
        this.optionSource = optionSource;
    }

    @Override
    public void mechanicalEnergyOf() {
        System.out.println("ENERGIA MECANICA: ");
        System.out.println("Energia mecanica obtenida a partir de la bateria del coche electrico");
    }

    @Override
    public void accelerate() {
        powerSource(getOptionSource());
    }

    @Override
    public void stop() {
        System.out.println("stopping the car with the regenerative braking system");
    }

    public void powerSource(String optionSource) {
        if (Objects.equals("battery",optionSource)){
            System.out.println("the power source is the battery");
            if (hasBattery(getSource())){
                System.out.println("accelerating the car with the battery");
            }else {
                System.out.println("I can not accelerate the car");
            }
        } else {
            System.out.println("the selected energy source does not correspond to a electric car");
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

    @Override
    public String toString() {
        return "ElectricCar{" +
                "battery=" + battery +
                ", optionSource='" + optionSource + '\'' +
                '}';
    }
}
