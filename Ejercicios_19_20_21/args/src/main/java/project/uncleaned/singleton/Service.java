package project.uncleaned.singleton;

import java.util.ArrayList;

public class Service {


   private  ArrayList<Client> clients;
   private ArrayList<Provider> providers;
   private ArrayList<Product> products;

    public Service() {
    }

    public Service(ArrayList<Client> clients, ArrayList<Provider> providers, ArrayList<Product> products) {
        this.clients = clients;
        this.providers = providers;
        this.products = products;
    }

    public ArrayList<Client> saveObject(Client client) {
        clients.add(client);
        Database database = Database.getInstance();
        database.setClients(clients);
        return clients;
    }
    public ArrayList<Product> saveObject(Product product) {
        products.add(product);
        Database database = Database.getInstance();
        database.setProducts(products);
        return products;
    }

    public ArrayList<Provider> saveObject(Provider provider) {
        providers.add(provider);
        Database database = Database.getInstance();
        database.setProviders(providers);
        return providers;
    }



}
