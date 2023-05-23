package patterns.design.patterns.creational.factory;

public class Road implements Delivery{
    @Override
    public void planDelivery() {
        System.out.println("Entrega por tierra con camion en una caja");
    }
}
