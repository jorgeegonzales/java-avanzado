package patterns.design.patterns.structural.adapter;

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
