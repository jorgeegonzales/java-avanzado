package clean.functions;

import java.util.ArrayList;

public class DataBases {
    private ArrayList<String> names;


    public ArrayList<String> initializeNames(){
        return new ArrayList<>();
    }
    public void addName(String name){
        if(names == null){
            names = initializeNames();
            names.add(name);
        } else {
            names.add(name);
        }
    }

    public ArrayList<String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "DataBases{" +
                "names=" + names +
                '}';
    }
}
