package args.adapter;

/**
 * Esta clase determina las propiedades del agujero circular.
 * Provee un metodo que determina si el agujero circular es compatible con la clavija circular.
 */
public class RoundHole {
    private double radius;

    public RoundHole() {
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Boolean fits(RoundPeg roundPeg){
        return this.getRadius() >= roundPeg.getRadius();
    }

}
