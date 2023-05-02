package patterns.design.patterns.creational.builder;

public class Vehiculo {

    private String brand;
    private String model;
    private String bodywork;
    private String engine;
    private Integer seats;
    private String electronicSystem;
    private Integer wheels;

    public Vehiculo() {
    }

    public Vehiculo (String brand,String model){
        this.brand = brand;
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBodywork() {
        return bodywork;
    }

    public void setBodywork(String bodywork) {
        this.bodywork = bodywork;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getElectronicSystem() {
        return electronicSystem;
    }

    public void setElectronicSystem(String electronicSystem) {
        this.electronicSystem = electronicSystem;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodywork='" + bodywork + '\'' +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                ", electronicSystem='" + electronicSystem + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
