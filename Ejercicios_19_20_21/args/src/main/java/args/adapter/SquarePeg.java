package args.adapter;

/**
 * Esta clase determina las propiedades de la clavija cuadrada.
 */
public class SquarePeg {
    private double width;

    public SquarePeg() {
    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
