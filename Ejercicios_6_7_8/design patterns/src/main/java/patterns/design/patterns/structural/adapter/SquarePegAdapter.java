package patterns.design.patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg{

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public Double getRadius(){
        return squarePeg.getWidth()*(Math.sqrt(2)/2);
    }
}
