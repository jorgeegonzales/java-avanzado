package patterns.design.patterns.creational.factory;

public class Ship extends Vehiculo {

    private Integer seats;
    public Ship() {
    }

    public Ship(String brand, String model, String bodywork, String engine, String electronicSystem, Integer seats) {
        super(brand, model, bodywork, engine, electronicSystem);
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

//    @Override
//    public String toString() {
//        return "Ship{" +
//                "seats=" + seats +
//                '}';
//    }
}
