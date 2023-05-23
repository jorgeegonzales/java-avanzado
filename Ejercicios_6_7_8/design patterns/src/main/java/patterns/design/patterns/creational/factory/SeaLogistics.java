package patterns.design.patterns.creational.factory;

public class SeaLogistics implements Factory {

    Vehiculo vehiculo;
    @Override
    public Vehiculo createTransport() {
        return new Ship("Yamaha","SX190","Aluminun","Motor marino Yamaha High Output de 1.8 litros","Engine Control Unit",2);
    }


    @Override
    public Vehiculo build() {
        return this.vehiculo;
    }
}
