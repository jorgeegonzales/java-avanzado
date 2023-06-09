package patterns.design.patterns.structural.adapter;

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
