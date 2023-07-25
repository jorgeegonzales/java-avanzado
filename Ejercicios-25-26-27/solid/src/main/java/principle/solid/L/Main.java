package principle.solid.L;

import java.util.Objects;

/**
 * LISKOV'S SUBSTITUTION PRINCIPLE
 * Options to be passed by array args to execute the code.
 * CombustionCar: CarType FuelValue ---> " combustion 100 "
 * ElectricCar: CarType BatteryValue ---> " electric 100 "
 * HybridCar: CarType PowerSource EnergyValue ---> " hybrid fuel 100 " o " hybrid battery 100"
 */
public class Main {
    public static void main(String[] args) {
        AbstractVehiculo car;
        String cardType = args[0];
        if ("combustion".equals(cardType)) {
            car = new CombustionCar();
            car.accelerate();
            car.stop();
        } else if ("electric".equals(cardType)) {
            car = new ElectricCar();
            int battery = Integer.parseInt(args[1]);
            car.setBattery(battery);
            car.accelerate();
            car.stop();
        }else if ("hybrid".equals(cardType)) {
            car = new HybridCar();
            String option = args[1];
            car.setSource(option);

            if(Objects.equals("fuel", option)){
                int fuel = Integer.parseInt(args[2]);
                car.setFuel(fuel);
            }

            if (Objects.equals("battery", option)){
                int battery = Integer.parseInt(args[2]);
                car.setBattery(battery);

            }

            car.accelerate();
            car.stop();

        } else {
            throw new RuntimeException("Invalid car");
        }
    }
}