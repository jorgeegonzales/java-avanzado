package patterns.design.patterns.creational.singleton;

import java.util.ArrayList;

/**
 * Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona
 * un punto de acceso global a dicha instancia.
 */
public class AppSingleton {

    public static void main(String[] args) {

        // Creando las Entidades
        Client jorge = new Client("jorge",75645632,"Urb. Virgen del Rosario - 123","jorgee@gmail.com",996677234);
        Client lionel = new Client("lionel",71345134,"Urb. Las Camelias - 135","lionel@gmail.com",946872234);

        Provider jose = new Provider("jose",78645936,"Urb. Virgen de las Mercedes - 140","jose@gmail.com",996677245);
        Provider william = new Provider("william",76543212,"Urb. Virgen de las Mercedes - 150","william@gmail.com",987543231);

        Product mascarilla = new Product("Mascarilla KN95","Material Hipoalergenico",200,4.5);
        Product alcohol = new Product("Alcohol 95","Solucion desinfectante",100,9.5);
        // Guardando en base de datos
        Service saveDatabase = new Service(new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        saveDatabase.saveObject(jorge);
        saveDatabase.saveObject(lionel);
        saveDatabase.saveObject(jose);
        saveDatabase.saveObject(william);
        saveDatabase.saveObject(mascarilla);
        saveDatabase.saveObject(alcohol);

        // Instanciando la base de datos
        Database database = Database.getInstance();
        System.out.println(database);

        Database database2 = Database.getInstance();
        System.out.println(database2);
    }


}
