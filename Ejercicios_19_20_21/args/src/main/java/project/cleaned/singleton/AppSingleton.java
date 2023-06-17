package project.cleaned.singleton;

import project.cleaned.Operations;


/**
 * Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona
 * un punto de acceso global a dicha instancia.
 */

/**
 * Se limpio el codigo dentro del metodo main, se creo un metodo que ejecutara de manera generica la creacion de inentidades y la insercion en
 * base de datos.Captando los argumentos por el array args del metodo main.Pasandolos al programa ya existente.
 */

/**
 * Ingresar por consola el siguiente comando: java -cp .\target\classes project.cleaned.singleton entity name documentNumber address email phone
 * para crear personas :
 * Client
 * java -cp .\target\classes project.cleaned.singleton.AppSingleton entity Client name jorge documentNumber 75645632 address Urb.-Virgen-del-Rosario-123 email jorgee@gmail.com phone 996677234
 * java -cp .\target\classes project.cleaned.singleton.AppSingleton entity Client name lionel documentNumber 71345134 address Urb.-Las-Camelias-135 email jorgee@gmail.com phone 946872234
 * Provider
 * java -cp .\target\classes project.cleaned.singleton.AppSingleton entity Provider name jose documentNumber 78645936 address Urb.-Virgen-de-las-Mercedes-140 email jose@gmail.com phone 996677234
 * java -cp .\target\classes project.cleaned.singleton.AppSingleton entity Provider name william documentNumber 76543212 address Urb.-Virgen-de-las-Mercedes-150 email william@gmail.com phone 987543231
 * Para crear productos :
 * Product
 * java -cp .\target\classes project.cleaned.singleton.AppSingleton entity Product name Mascarilla-KN95 description Material-Hipoalergenico stock 200 price 4.5
 * java -cp .\target\classes project.cleaned.singleton.AppSingleton entity Product name Alcohol-95 description Solucion-desinfectante stock 100 price 9.5
 *
 */
public class AppSingleton {

    public static void main(String[] args) {

        System.out.println("Creando las Entidades y guardando en base de datos");
        Operations operations = new Operations();
        operations.createEntity(args);

        System.out.println("Instanciando la base de datos e imprimiendo la base de datos");
        Database database = Database.getInstance();
        System.out.println(database);

    }


}
