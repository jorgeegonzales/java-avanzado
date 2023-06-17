package args.adapter;

import java.util.Objects;

/**
 * Esta clase determina si el tipo de clavija es compatible con el agujero.
 * E decir si el tipo de clavija encaja con el agujero actual.
 */
public class FitsPeg {
    public void fitsPeg(String peg,double radiusHole,double radiusPeg,double width){
        if(Objects.equals(peg, "Round")){
            RoundHole hole = new RoundHole(radiusHole);
            RoundPeg roundPeg = new RoundPeg(radiusPeg);
             if(hole.fits(roundPeg)){
                 System.out.println("La clavija " + peg + " Es compatible con el agujero");
             }else {
                 System.out.println("La clavija " + peg + " No es compatible con el agujero");
             }

        } else if (Objects.equals(peg,"Square")){
            RoundHole hole = new RoundHole(radiusHole);
            SquarePeg squarePeg = new SquarePeg(width);
            SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

            if(hole.fits(squarePegAdapter)){
                System.out.println("La clavija " + peg + " Es compatible con el agujero");
            } else {
                System.out.println("La clavija " + peg + " No es compatible con el agujero");
            }

        } else {
            System.out.println("El tipo de clavija " + peg + " No es compatible con el agujero");
        }

    }
}
