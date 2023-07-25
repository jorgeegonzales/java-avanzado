package principle.solid.D.main;

import principle.solid.D.databases.AccesoADatos;
import principle.solid.D.databases.DatabaseService;
import principle.solid.D.car.dependency_inversion.Car;
import principle.solid.D.car.carType.CombustionCar;
import principle.solid.D.car.carType.ElectricCar;
import principle.solid.D.car.carType.HybridCar;

/**
 * PRINCIPLE OF INVESTMENT OF DEPENDENCIES
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
            AccesoADatos accesoADatos = new AccesoADatos(new DatabaseService());
            accesoADatos.getConexion().saveCar(car);
            System.out.println(accesoADatos.getConexion().getDataBase());
        } else if("electric".equals(carType)){
            car = new Car(new ElectricCar());
            String optionSource = args[1];
            int battery = Integer.parseInt(args[2]);
            car.getConexionCar().setOptionSource(optionSource);
            car.getConexionCar().setSource(battery);
            car.getConexionCar().mechanicalEnergyOf();
            car.getConexionCar().accelerate();
            car.getConexionCar().stop();
            AccesoADatos accesoADatos = new AccesoADatos(new DatabaseService());
            accesoADatos.getConexion().saveCar(car);
            System.out.println(accesoADatos.getConexion().getDataBase());
        } else if("hybrid".equals(carType)){
            car = new Car(new HybridCar());
            String optionSource = args[1];
            int source = Integer.parseInt(args[2]);
            car.getConexionCar().setOptionSource(optionSource);
            car.getConexionCar().setSource(source);
            car.getConexionCar().mechanicalEnergyOf();
            car.getConexionCar().accelerate();
            car.getConexionCar().stop();
            AccesoADatos accesoADatos = new AccesoADatos(new DatabaseService());
            accesoADatos.getConexion().saveCar(car);
            System.out.println(accesoADatos.getConexion().getDataBase());
        } else {
            throw new RuntimeException("Invalid car");
        }
    }
}
