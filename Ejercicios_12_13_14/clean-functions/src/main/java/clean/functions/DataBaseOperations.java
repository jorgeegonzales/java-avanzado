package clean.functions;

public class DataBaseOperations {

    private DataBases dataBases;
    public  void initializeDataBases(){
        this.dataBases = new DataBases();
    }

    public void addNameDataBases(String name){
        if(this.dataBases == null){
            initializeDataBases();
            this.dataBases.addName(name);
        } else {
            this.dataBases.addName(name);
        }

    }

    public  void printNames(){
        System.out.println("Printing Database Names: ");
        for (String value: this.dataBases.getNames()) {
            System.out.println(value);
        }
    }


}
