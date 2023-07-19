package principle.solid.s;

public class Coche {
    public String marca;
    public String fuel;
    public String transmission;


    Coche(String marca,String fuel,String transmission){
        this.marca = marca;
        this.fuel = fuel;
        this.transmission = transmission;


    }


    @Override
    public String toString() {

        return "Coche{" +
                "marca='" + marca + '\'' +
                ", fuel='" + fuel + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';

    }
}
