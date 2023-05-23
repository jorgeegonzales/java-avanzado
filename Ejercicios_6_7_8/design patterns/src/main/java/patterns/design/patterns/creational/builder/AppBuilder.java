package patterns.design.patterns.creational.builder;

/**
 * Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos
 * y representaciones de un objeto empleando el mismo código de construcción.Nos permite que el constructor de un objeto se contruya paso a paso, asi
 * al inicializar un objeto no se vuelve engorroso ya que el contructor no tendra determinado numero de parametros, sino que este sera variable.
 */
public class AppBuilder {
    public static void main(String[] args) {
        Vehiculo car = new Builder("Toyota","Corolla")
                .setBodywork("Aluminum")
                .setEngine("12OO")
                .setSeats(5)
                .setWheels(4)
                .setElectronicSystem("Engine Control Unit")
                .build();

        System.out.println(car);

        Vehiculo motorcycle = new Builder("Bajaj","Pulsar")
                .setBodywork("Aluminum")
                .setEngine("200")
                .setSeats(2)
                .setWheels(2)
                .setElectronicSystem("Engine Control Unit")
                .build();

        System.out.println(motorcycle);

    }
}
