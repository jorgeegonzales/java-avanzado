package patterns.design.patterns.behaviors.observer;

/**
 * Observer es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción para notificar a varios objetos
 * sobre cualquier evento que le suceda al objeto que están observando.En este caso se esta observado al objeto Store de un Ecommerce y
 * se esta notificando a los clientes que son instancias de la clase Client.
 */
public class AppObserver {

    public static void main(String[] args) {
        // CREANDO LOS CLIENTES
        System.out.println("CREANDO LOS CLIENTES");
        Creator creator = new Creator();
        creator.createClient("jorge","jorgeeqgmail.com");
        creator.createClient("jose","jose@gmail.com");
        creator.createClient("lionel","lionel@gmail.com");
        creator.createClient("william","william@gmail.com");

        System.out.println(creator.getDataBaseClients().getClients());

        // CREANDO LOS PRODUCTOS
        System.out.println("CREANDO LOS PRODUCTOS");
        creator.createProduct("Hair Cliper Whal","Cortadora de cabello profesional",80.75);
        creator.createProduct("Trimmer Kemei","Cortadora de barba profesional",60.55);
        creator.createProduct("Shaver kemei","Rasuradora profesional",45.50);
        creator.createProduct("Shears","Tijeras de cabello profesional",30.50);

        System.out.println(creator.getDataBaseProducts().getProducts());

        // CREANDO LA TIENDA
        System.out.println(" CREANDO LA TIENDA");
        creator.createStore("The Barber");
        System.out.println(creator.getEcommerce().getStores());

        // SUMINISTRO DE PRODUCTOS A LA TIENDA
        System.out.println("SUMINISTRO DE PRODUCTOS A LA TIENDA");
        creator.storeSupply("The Barber","Hair Cliper Whal");
        creator.storeSupply("The Barber","Trimmer Kemei");
        creator.storeSupply("The Barber","Shaver kemei");
        creator.storeSupply("The Barber","Shears");

        System.out.println(creator.getEventManager().getProductsSupply());

        // AGREGAR SUBSCRIPTORES A LAS TIENDAS
        System.out.println("AGREGAR SUBSCRIPTORES A LAS TIENDAS");
        creator.createSubscribers("The Barber","jorge");
        creator.createSubscribers("The Barber","jose");
        creator.createSubscribers("The Barber","lionel");
        creator.createSubscribers("The Barber","william");

        System.out.println(creator.getEventManager().getSubscribers());

        // CREANDO NUEVOS PRODUCTOS EN LA TIENDA THE BARBER
        System.out.println("CREANDO NUEVOS PRODUCTOS EN LA TIENDA THE BARBER");
        creator.createProduct("American Crew Cera","Cera para cabello fiber Mate 85g",89.90);
        creator.storeSupply("The Barber","American Crew Cera");
        System.out.println(creator.getEventManager().getProductsSupply());

        // REMOVIENDO UN PRODUCTO DE LA TIENDA THE BARBER
        System.out.println("REMOVIENDO UN PRODUCTO DE LA TIENDA THE BARBER");
        creator.storeStockouts("The Barber","Trimmer Kemei");
        System.out.println(creator.getEventManager().getProductsSupply());

        // PROMOCIONANDO BUENOS PRECIOS DE PRODUCTOS DE LA TIENDA THE BARBER
        System.out.println("PROMOCIONANDO BUENOS PRECIOS DE PRODUCTOS DE LA TIENDA THE BARBER");
        creator.promotion("The Barber","Hair Cliper Whal");


    }
}
