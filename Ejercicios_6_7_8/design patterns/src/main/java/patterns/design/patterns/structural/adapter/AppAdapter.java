package patterns.design.patterns.structural.adapter;

public class AppAdapter  {
    public static void main(String[] args) {
        FitsPeg fitsPeg = new FitsPeg();
        fitsPeg.fitsPeg("Round",5D,5D,null);

        fitsPeg.fitsPeg("Square",5D,5D,7.07D);

    }
}
