package args;

import args.adapter.FitsPeg;
import args.parser.OptionsArgs;

import java.util.Arrays;
import java.util.Map;

/**
 * tipos de clavija permitidas (peg):
 * Round
 * Square
 * Ingresar por consola el siguiente comando: java -cp .\target\classes args.AppAdapterWithArgs peg radiusHole radiusPeg width
 * Ejemplo:
 * java -cp .\target\classes args.AppAdapterWithArgs peg Round radiusHole 5.0 radiusPeg 5.0 width 0.0
 * java -cp .\target\classes args.AppAdapterWithArgs peg Square radiusHole 5.0 radiusPeg 5.0 width 7.07
 */
public class AppAdapterWithArgs {
    public static void main(String[] args) {

        OptionsArgs optionsArgs = new OptionsArgs();
        Map<String,String> parameters = optionsArgs.argsOptionsParameters(args);
        String[] valuesParameters = optionsArgs.argumentsArrayValuesParameters(parameters);
        String peg = valuesParameters[0];
        double radiusHole = Double.parseDouble(valuesParameters[1]);
        double radiusPeg = Double.parseDouble(valuesParameters[2]);
        double width = Double.parseDouble(valuesParameters[3]);
        FitsPeg fitsPeg = new FitsPeg();
        fitsPeg.fitsPeg(peg,radiusHole,radiusPeg,width);

    }
}



