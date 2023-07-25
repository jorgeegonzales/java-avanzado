package org.example.combustion;

import org.example.main.Vehiculo;

public class CombustionCar extends Vehiculo {

     private CombustionPowerSource combustionPowerSource = new CombustionPowerSource() {
         @Override
         public int getFuel() {
             return CombustionCar.this.getFuel();
         }

         @Override
         public void setFuel(int fuel) {
            CombustionCar.this.setFuel(fuel);
         }
     };

//    public CombustionCar(CombustionCarPowerSource combustionCarPowerSource){
//        this.combustionCarPowerSource = combustionCarPowerSource;
//    }



   public int getFuel() {
      return this.getCombustionPowerSource().getFuel();
   }

    public void setFuel(int fuel){
        this.getCombustionPowerSource().setFuel(fuel);
    }



    @Override
    public void mechanicalEnergyOfCombustion() {
        System.out.println("ENERGIA MECANICA: ");
        System.out.println("Energia mecanica producto luego de quemar combustible en el motor de combustion");
    }

    @Override
    public void accelerate() {
        if (hasFuel(getCombustionPowerSource().getFuel())){
            System.out.println("accelerating the car with the fuel");
        } else {
            System.out.println("I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        System.out.println("stopping the car with the ABS braking system");
    }

    public boolean hasFuel(int fuel) {
        System.out.println("checking fuel");
        if (fuel <= 0) {
            System.out.println("the fuel is very low :(");
            return false;
        } else {
            System.out.println("fuel OK :)");
            return true;
        }
    }

    public CombustionPowerSource getCombustionPowerSource() {
        return combustionPowerSource;
    }

    public void setCombustionPowerSource(CombustionPowerSource combustionPowerSource) {
        this.combustionPowerSource = combustionPowerSource;
    }
}
