package org.example.main;

import org.example.combustion.CombustionCar;
import org.example.combustion.CombustionCarPowerSource;
//import principle.solid.D.electric.ElectricCar;
//import principle.solid.D.electric.ElectricCarPowerSource;
//import principle.solid.D.hybrid.HybridCar;
//import principle.solid.D.hybrid.HybridCarPowerSource;

import java.util.Objects;

/**
 * PRINCIPLE OF INVESTMENT OF DEPENDENCIES
 * Options to be passed by array args to execute the code.
 * CombustionCar: CarType FuelValue ---> " combustion 100 "
 * ElectricCar: CarType BatteryValue ---> " electric 100 "
 * HybridCar: CarType PowerSource EnergyValue ---> " hybrid fuel 100 " o " hybrid battery 100"
 */
public class Main {
    public static void main(String[] args) {

        String cardType = args[0];
        if ("combustion".equals(cardType)) {
            CombustionCar combustionCar = new CombustionCar();
            System.out.println("COMBUSTION CAR");
            System.out.println("================================================");
            int fuel = Integer.parseInt(args[1]);
            combustionCar.getCombustionPowerSource().setFuel(fuel);
            combustionCar.accelerate();
            combustionCar.stop();
            combustionCar.mechanicalEnergyOfCombustion();
        } else if ("electric".equals(cardType)) {
//            ElectricCarPowerSource electricCarPowerSource = new ElectricCarPowerSource();
//            ElectricCar electricCar = new ElectricCar(electricCarPowerSource);
//            System.out.println("ELECTRIC CAR");
//            System.out.println("================================================");
//            int battery = Integer.parseInt(args[1]);
//            electricCar.getElectricCarPowerSource().setBattery(battery);
//            electricCar.accelerate();
//            electricCar.stop();
//            electricCar.mechanicalEnergyForElectricalEnergy();
        }else if ("hybrid".equals(cardType)) {
//            HybridCarPowerSource hybridCarPowerSource = new HybridCarPowerSource();
//            HybridCar hybridCar = new HybridCar(hybridCarPowerSource);
//            System.out.println("HYBRID CAR");
//            System.out.println("================================================");
            String option = args[1];
//            hybridCar.getHybridCarPowerSource().setSource(option);

            if(Objects.equals("fuel", option)){
//                int fuel = Integer.parseInt(args[2]);
//                hybridCar.getHybridCarPowerSource().getCombustionCarPowerSource().setFuel(fuel);
            }

            if (Objects.equals("battery", option)){
//                int battery = Integer.parseInt(args[2]);
//                hybridCar.getHybridCarPowerSource().getElectricCarPowerSource().setBattery(battery);

            }

//            hybridCar.accelerate();
//            hybridCar.stop();
//            hybridCar.mechanicalEnergyByTheHybridSystem();

        } else {
            throw new RuntimeException("Invalid car");
        }
    }
}