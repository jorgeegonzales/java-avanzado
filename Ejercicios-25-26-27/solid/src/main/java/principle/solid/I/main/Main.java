package principle.solid.I.main;

import principle.solid.I.car.carType.CombustionCar;
import principle.solid.I.car.carType.ElectricCar;
import principle.solid.I.car.carType.HybridCar;
import principle.solid.I.car.dependency_inversion.Car;

/**
 * INTERFACE SEGREGATION PRINCIPLE
 * Options to be passed by array args to execute the code.
 * CombustionCar: CarType PowerSource FuelValue ---> " combustion fuel 100 "
 * ElectricCar: CarType PowerSource BatteryValue ---> " electric battery 100 "
 * HybridCar: CarType PowerSource EnergyValue ---> " hybrid fuel 100 " o " hybrid battery 100"
 */

public class Main {
    public static void main(String[] args) {
        Car car;
        String carType = args[0];
        if("combustion".equals(carType)){
            car = new Car(new CombustionCar());
            String optionSource = args[1];
            int fuel = Integer.parseInt(args[2]);
            car.getConexionCar().setOptionSource(optionSource);
            car.getConexionCar().setSource(fuel);
            car.getConexionCar().mechanicalEnergyOf();
            car.getConexionCar().accelerate();
            car.getConexionCar().stop();
        } else if("electric".equals(carType)){
            car = new Car(new ElectricCar());
            String optionSource = args[1];
            int battery = Integer.parseInt(args[2]);
            car.getConexionCar().setOptionSource(optionSource);
            car.getConexionCar().setSource(battery);
            car.getConexionCar().mechanicalEnergyOf();
            car.getConexionCar().accelerate();
            car.getConexionCar().stop();
        } else if("hybrid".equals(carType)){
            car = new Car(new HybridCar());
            String optionSource = args[1];
            int source = Integer.parseInt(args[2]);
            car.getConexionCar().setOptionSource(optionSource);
            car.getConexionCar().setSource(source);
            car.getConexionCar().mechanicalEnergyOf();
            car.getConexionCar().accelerate();
            car.getConexionCar().stop();
        } else {
            throw new RuntimeException("Invalid car");
        }
    }
}
