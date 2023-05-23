package patterns.design.patterns.creational.builder;

public interface ServiceBuilder {

    public Builder setBodywork(String bodywork);
    public Builder setEngine(String engine);
    public Builder setSeats(Integer seats);
    public Builder setElectronicSystem(String electronicSystem);
    public Builder setWheels(Integer wheels);
    public Vehiculo build();

}
