package patterns.design.patterns.creational.factory;

public class Vehiculo {

    private String brand;
    private String model;
    private String bodywork;
    private String engine;
    private String electronicSystem;

    public Vehiculo() {
    }

    public Vehiculo(String brand, String model, String bodywork, String engine, String electronicSystem) {
        this.brand = brand;
        this.model = model;
        this.bodywork = bodywork;
        this.engine = engine;
        this.electronicSystem = electronicSystem;
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

    public String getBodywork() {
        return bodywork;
    }

    public void setBodywork(String bodywork) {
        this.bodywork = bodywork;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getElectronicSystem() {
        return electronicSystem;
    }

    public void setElectronicSystem(String electronicSystem) {
        this.electronicSystem = electronicSystem;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodywork='" + bodywork + '\'' +
                ", engine='" + engine + '\'' +
                ", electronicSystem='" + electronicSystem + '\'' +
                '}';
    }
}
