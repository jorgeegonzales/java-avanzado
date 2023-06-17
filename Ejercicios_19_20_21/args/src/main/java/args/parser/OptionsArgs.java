package args.parser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OptionsArgs {

   private Map<String,String> parameters = new HashMap<>();

    public void registerOption(String optionName,String value) {
        parameters.put(optionName, value);
    }

    public void setValue(String optionName, String value) {

        parameters.replace(optionName, value);
    }

    public Map<String,String> getParameters() {
        return parameters;
    }
    public Map<String,String> argsOptionsParameters(String[] args){
        for (int i = 0;i < args.length;i++){
            if((i % 2) == 0){
                registerOption(args[i],args[i+1]);
            }
        }
        return getParameters();
    }

    public String[] argsArrayValuesParameters(Map<String,String> parameters){
        Collection<String> values = parameters.values();
        String[] valuesParameters = new String[parameters.values().size()];
        int contador = 0 ;
        for (String value : values) {
            valuesParameters[contador]= value;
            contador++;
        }
        return valuesParameters;
    }
}
