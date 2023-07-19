package principle.solid.o;

public class Honda extends Coche{
    Honda(String marca, String fuel, String transmission) {
        super(marca, fuel, transmission);
    }

    @Override
    int precioCoche() {
        System.out.println("Precio del Coche Honda");
        return 25000;
    }

    @Override
    Coche Coches() {
        System.out.println("Imprimiendo el Coche Honda");
        return this;
    }
}
