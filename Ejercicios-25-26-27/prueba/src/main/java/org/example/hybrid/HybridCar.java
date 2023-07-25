package org.example.hybrid;

import org.example.main.Vehiculo;

import java.util.Objects;

public class HybridCar extends Vehiculo {
     private HybridCarPowerSource hybridCarPowerSource;

    public HybridCar(HybridCarPowerSource hybridCarPowerSource){
        this.hybridCarPowerSource = hybridCarPowerSource;
    }

    public String getSource(){
        return hybridCarPowerSource.getSource();
    };
    public void setSource(String source){
        hybridCarPowerSource.setSource(source);
    }

    @Override
    public void mechanicalEnergyByTheHybridSystem() {
        System.out.println("ENERGIA MECANICA: ");
        System.out.println("La energia mecanica generada por el sistema Hybrido comprende la generacion de manera independiente tanto del motor de combustion como el motor electrico o la actuacion de ambos en conjunto");
    }

    @Override
    public void accelerate() {
        powerSource(getHybridCarPowerSource().getSource());
    }

    @Override
    public void stop() {
        System.out.println("stopping the car with the regenerative braking system");
    }

    public void powerSource(String source) {
        if (Objects.equals("fuel",source)) {
            System.out.println("the source of energy is fuel");
            if (hasFuel(getHybridCarPowerSource().getCombustionCarPowerSource().getFuel())){
                System.out.println("accelerating the car with the fuel");
            }else {
                System.out.println("I can not accelerate the car");
            }
        } else if (Objects.equals("battery",source)){
            System.out.println("the power source is the battery");
            if (hasBattery(getHybridCarPowerSource().getElectricCarPowerSource().getBattery())){
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

    public HybridCarPowerSource getHybridCarPowerSource() {
        return hybridCarPowerSource;
    }

    public void setHybridCarPowerSource(HybridCarPowerSource hybridCarPowerSource) {
        this.hybridCarPowerSource = hybridCarPowerSource;
    }
}
