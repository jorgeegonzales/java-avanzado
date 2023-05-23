package patterns.design.patterns.structural.adapter;

import java.util.Objects;

public class FitsPeg {
    public void fitsPeg(String peg,Double radiusHole,Double radiusPeg,Double width){
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
