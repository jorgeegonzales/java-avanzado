package principle.solid.o;

public class Toyota extends Coche{
    Toyota(String marca, String fuel, String transmission) {
        super(marca, fuel, transmission);
    }

    @Override
    int precioCoche() {

        System.out.println("Precio del Coche Toyota");
        return 18000;
    }

    @Override
    Coche Coches() {
        System.out.println("Imprimiendo el Coche Toyota");
        return this;
    }
}
