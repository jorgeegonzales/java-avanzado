package principle.solid.I.car.dependency_inversion;


public class Car {
    private ConexionCar conexionCar;
    public Car(ConexionCar conexionCar){
        this.conexionCar = conexionCar;
    }

    public ConexionCar getConexionCar() {
        return conexionCar;
    }

    public void setConexionCar(ConexionCar conexionCar) {
        this.conexionCar = conexionCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "conexionCar=" + conexionCar +
                '}';
    }
}
