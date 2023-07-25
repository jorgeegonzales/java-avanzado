package principle.solid.O;

/**
 * OPEN / CLOSED PRINCIPLE
 */
public class Main {
    public static void main(String[] args) {
        Coche[] arrayCoches = {
                new Hyundai("Hyundai","Gasoline","Mechanics"),
                new Honda("Honda","Gasoline","Mechanics"),
                new Toyota("Toyota","Gasoline","Mechanics")
        };

        imprimirPrecioCoche(arrayCoches);
        imprimirCoches(arrayCoches);

    }

    public static void imprimirPrecioCoche(Coche[] arrayCoches){
        for (Coche coche : arrayCoches) {
            System.out.println(coche.precioCoche());
        }
    }
    public static void imprimirCoches(Coche[] arrayCoches){
        for (Coche coche : arrayCoches) {
            System.out.println(coche.Coches());
        }
    }
}