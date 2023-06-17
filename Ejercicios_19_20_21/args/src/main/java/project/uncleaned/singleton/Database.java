package project.uncleaned.singleton;

import java.util.ArrayList;

public class Database {
    private static Database instance;

    private ArrayList<Client> clients;
    private ArrayList<Provider> providers;
    private ArrayList<Product> products;

    private Database() {
    }

    public Database(ArrayList<Client> clients, ArrayList<Provider> providers, ArrayList<Product> products) {
        this.clients = clients;
        this.providers = providers;
        this.products = products;
    }

    public static Database getInstance(){

        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    public static void setInstance(Database instance) {
        Database.instance = instance;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Database{" +
                "clients=" + clients +
                ", providers=" + providers +
                ", products=" + products +
                '}';
    }
}
