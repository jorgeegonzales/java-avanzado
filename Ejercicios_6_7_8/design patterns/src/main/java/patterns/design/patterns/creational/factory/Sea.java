package patterns.design.patterns.creational.factory;

public class Sea implements Delivery{
    @Override
    public void planDelivery() {
        System.out.println("Entrega por mar con barco en un contenedor");
    }
}
