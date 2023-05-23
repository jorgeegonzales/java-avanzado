package patterns.design.patterns.creational.factory;

public class RoadLogistics implements Factory {

    Vehiculo vehiculo;
    @Override
    public Vehiculo createTransport() {
        return new Truck("Hyunday","HD35","Aluminun","Hyundai D4CB (electrónico EURO IV)","Engine Control Unit",3,6);
    }

    @Override
    public Vehiculo build() {
        return this.vehiculo;
    }
}
