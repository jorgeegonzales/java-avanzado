package principle.solid.D.car.carType;

import principle.solid.D.car.dependency_inversion.Vehiculo;

import java.util.Objects;

public class CombustionCar extends Vehiculo {
    private int fuel;

    private String optionSource;


    public CombustionCar(){
        System.out.println("COMBUSTION CAR");
        System.out.println("================================================");
    }

    @Override
    public int getSource() {
        return fuel;
    }

    @Override
    public void setSource(int source) {
        this.fuel = source;
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
        System.out.println("Energia mecanica producto luego de quemar combustible en el motor de combustion");
    }

    @Override
    public void accelerate() {
        powerSource(getOptionSource());
    }

    @Override
    public void stop() {
        System.out.println("stopping the car with the ABS braking system");
    }

    public void powerSource(String optionSource) {
        if (Objects.equals("fuel",optionSource)) {
            System.out.println("the source of energy is fuel");
            if (hasFuel(getSource())){
                System.out.println("accelerating the car with the fuel");
            }else {
                System.out.println("I can not accelerate the car");
            }
        } else {
            System.out.println("the selected energy source does not correspond to a combustion car");
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

    @Override
    public String toString() {
        return "CombustionCar{" +
                "fuel=" + fuel +
                ", optionSource='" + optionSource + '\'' +
                '}';
    }
}
