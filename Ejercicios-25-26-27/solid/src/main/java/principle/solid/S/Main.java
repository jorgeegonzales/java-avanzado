package principle.solid.S;

/**
 * SINGLE RESPONSIBILITY PRINCIPLE
 */
public class Main {
    public static void main(String[] args) {

        Coche hyundai = new Coche("Hyundai","Gasoline","Mechanics");
        Coche honda = new Coche("Honda","Gasoline","Mechanics");
        Coche toyota = new Coche("Toyota","Gasoline","Mechanics");

        CocheDB dataBase = new CocheDB();

        dataBase.saveCocheDB(hyundai);
        dataBase.saveCocheDB(honda);
        dataBase.saveCocheDB(toyota);

        System.out.println("Coches en base de datos");
        System.out.println(dataBase.CocheDataBase);

        dataBase.deleteCocheDB(honda);

        System.out.println("Coches en base de datos luego de eliminacion");
        System.out.println(dataBase.CocheDataBase);


    }
}