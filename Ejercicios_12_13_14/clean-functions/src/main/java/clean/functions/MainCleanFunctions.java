package clean.functions;

public class MainCleanFunctions {
    public static void main(String[] args) {

        DataBaseOperations dataBaseOperations = initializeDataBaseOperations();

        dataBaseOperations.addNameDataBases("jorge");
        dataBaseOperations.addNameDataBases("jose");
        dataBaseOperations.addNameDataBases("lionel");
        dataBaseOperations.addNameDataBases("william");

        dataBaseOperations.printNames();


    }

    public static DataBaseOperations initializeDataBaseOperations(){
        return new DataBaseOperations();
    }


}