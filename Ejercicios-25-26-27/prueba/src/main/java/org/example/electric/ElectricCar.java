package org.example.electric;

import org.example.main.Vehiculo;

public class ElectricCar extends Vehiculo {

    private ElectricCarPowerSource electricCarPowerSource;

    public ElectricCar(ElectricCarPowerSource electricCarPowerSource){
        this.electricCarPowerSource = electricCarPowerSource;
    }

    public int getBattery(){
        return electricCarPowerSource.getBattery();
    }
    public void setBattery(int battery){
        electricCarPowerSource.setBattery(battery);
    }

    @Override
    public void mechanicalEnergyForElectricalEnergy() {
        System.out.println("ENERGIA MECANICA: ");
        System.out.println("Energia mecanica obtenida a partir de la bateria del coche electrico");
    }

    @Override
    public void accelerate() {
        if (hasBattery(electricCarPowerSource.getBattery())){
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

    public ElectricCarPowerSource getElectricCarPowerSource() {
        return electricCarPowerSource;
    }

    public void setElectricCarPowerSource(ElectricCarPowerSource electricCarPowerSource) {
        this.electricCarPowerSource = electricCarPowerSource;
    }
}
