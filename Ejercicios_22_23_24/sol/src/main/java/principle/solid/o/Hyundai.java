package principle.solid.o;

public class Hyundai extends Coche{
    Hyundai(String marca, String fuel, String transmission) {
        super(marca, fuel, transmission);
    }

    @Override
    int precioCoche() {

        System.out.println("Precio del Coche Hyundai");
        return 20000;
    }

    @Override
    Coche Coches() {
        System.out.println("Imprimiendo el Coche Hyundai");
        return this;
    }
}
