package comments.adapter;

/**
 * Esta clase determina las propiedades de la clavija cuadrada.
 */
public class SquarePeg {
    private Double width;

    public SquarePeg() {
    }

    public SquarePeg(Double width) {
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
