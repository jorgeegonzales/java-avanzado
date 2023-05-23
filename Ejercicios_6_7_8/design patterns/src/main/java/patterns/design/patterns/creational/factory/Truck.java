package patterns.design.patterns.creational.factory;

public class Truck extends Vehiculo {

    private Integer seats;
    private Integer wheels;


    public Truck() {
    }

    public Truck(String brand, String model, String bodywork, String engine, String electronicSystem, Integer seats, Integer wheels) {
        super(brand, model, bodywork, engine, electronicSystem);
        this.seats = seats;
        this.wheels = wheels;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

//    @Override
//    public String toString() {
//        return "Truck{" +
//                "seats=" + seats +
//                ", wheels=" + wheels +
//                '}';
//    }
}
