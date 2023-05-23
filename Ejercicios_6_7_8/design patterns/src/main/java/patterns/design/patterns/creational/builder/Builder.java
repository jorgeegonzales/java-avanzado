package patterns.design.patterns.creational.builder;

public class Builder implements ServiceBuilder {

    Vehiculo vehiculo;

    public Builder() {
    }

    public Builder(String brand, String model) {
        vehiculo = new Vehiculo();
        vehiculo.setBrand(brand);
        vehiculo.setModel(model);
    }

    @Override
    public Builder setBodywork(String bodywork) {
        vehiculo.setBodywork(bodywork);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        vehiculo.setEngine(engine);
        return this ;
    }

    @Override
    public Builder setSeats(Integer seats) {
        vehiculo.setSeats(seats);
        return this;
    }

    @Override
    public Builder setElectronicSystem(String electronicSystem) {
        vehiculo.setElectronicSystem(electronicSystem);
        return this;
    }

    @Override
    public Builder setWheels(Integer wheels) {
        vehiculo.setWheels(wheels);
        return this;
    }

    @Override
    public Vehiculo build() {
        return this.vehiculo;
    }


}
