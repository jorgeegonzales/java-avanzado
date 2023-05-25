package comments.adapter;

/**
 * Esta clase determina las propiedades del agujero circular.
 * Provee un metodo que determina si el agujero circular es compatible con la clavija circular.
 */
public class RoundHole {
    private Double radius;

    public RoundHole() {
    }

    public RoundHole(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Boolean fits(RoundPeg roundPeg){
        return this.getRadius() >= roundPeg.getRadius();
    }

}
