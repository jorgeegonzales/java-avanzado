package args.adapter;

/**
 * Esta clase adaptador  provee un metodo para que la clavija cuadrada
 * que pueda ser envuelta por un radio nominal que se compatible con el agujero circular
 */
public class SquarePegAdapter extends RoundPeg {

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public double getRadius(){
        return squarePeg.getWidth()*(Math.sqrt(2)/2);
    }
}
