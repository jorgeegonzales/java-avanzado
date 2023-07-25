package org.example.hybrid;

import org.example.combustion.CombustionCarPowerSource;
import org.example.electric.ElectricCarPowerSource;

public class HybridCarPowerSource {

    private CombustionCarPowerSource combustionCarPowerSource = new CombustionCarPowerSource();
    private ElectricCarPowerSource electricCarPowerSource = new ElectricCarPowerSource();

    private String source = null;
    public String getSource(){
        return source;
    };
    public void setSource(String source){
        this.source = source;
    }


//    @Override
//    public int getFuel() {
//        return combustionCarPowerSource.getFuel();
//    }
//
//    @Override
//    public void setFuel(int fuel) {
//        combustionCarPowerSource.setFuel(fuel);
//    }
//
//    @Override
//    public int getBattery() {
//        return electricCarPowerSource.getBattery();
//    }
//
//    @Override
//    public void setBattery(int battery) {
//        electricCarPowerSource.setBattery(battery);
//    }

    public CombustionCarPowerSource getCombustionCarPowerSource() {
        return combustionCarPowerSource;
    }

    public void setCombustionCarPowerSource(CombustionCarPowerSource combustionCarPowerSource) {
        this.combustionCarPowerSource = combustionCarPowerSource;
    }

    public ElectricCarPowerSource getElectricCarPowerSource() {
        return electricCarPowerSource;
    }

    public void setElectricCarPowerSource(ElectricCarPowerSource electricCarPowerSource) {
        this.electricCarPowerSource = electricCarPowerSource;
    }
}
