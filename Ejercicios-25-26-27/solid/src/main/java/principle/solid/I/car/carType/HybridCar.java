package principle.solid.I.car.carType;

import principle.solid.I.car.dependency_inversion.Vehiculo;

import java.util.Objects;

public class HybridCar extends Vehiculo {
    private int source;

    private String optionSource;

    public HybridCar(){
        System.out.println("HYBRID CAR");
        System.out.println("================================================");
    }

    @Override
    public int getSource() {
        return source;
    }

    @Override
    public void setSource(int source) {
        this.source = source;
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
        System.out.println("La energia mecanica generada por el sistema Hybrido comprende la generacion de manera independiente tanto del motor de combustion como el motor electrico o la actuacion de ambos en conjunto");
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
        if (Objects.equals("fuel",optionSource)) {
            System.out.println("the source of energy is fuel");
            if (hasFuel(getSource())){
                System.out.println("accelerating the car with the fuel");
            }else {
                System.out.println("I can not accelerate the car");
            }
        } else if (Objects.equals("battery",optionSource)){
            System.out.println("the power source is the battery");
            if (hasBattery(getSource())){
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

    @Override
    public String toString() {
        return "HybridCar{" +
                "source=" + source +
                ", optionSource='" + optionSource + '\'' +
                '}';
    }
}
