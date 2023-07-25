package org.example.combustion;

public class CombustionCarPowerSource  implements  CombustionPowerSource{
    private int fuel = 0;

    public int getFuel(){
        return fuel;
    }
    public void setFuel(int fuel){
         this.fuel = fuel;
     }
}
