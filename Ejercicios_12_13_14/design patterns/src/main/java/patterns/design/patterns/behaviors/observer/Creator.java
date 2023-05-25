package patterns.design.patterns.behaviors.observer;

import java.util.*;

public class Creator {

    private DataBaseClients dataBaseClients = new DataBaseClients(new ArrayList<>());
    private DataBaseProducts dataBaseProducts = new DataBaseProducts(new ArrayList<>());

    private EventManager eventManager = new EventManager(new HashMap<>(),new HashMap<>());
    
    private Ecommerce ecommerce = new Ecommerce(new ArrayList<>());

    public Integer createIdClient(){
        return dataBaseClients.getClients().size() + 1;
    }
    public Integer createIdProduct(){
        return dataBaseProducts.getProducts().size() + 1;
    }
    
    public Integer createIdStore(){
        return ecommerce.getStores().size() + 1;
    }
    public void createClient(String username,String email){
        Client client = new Client(createIdClient(),username,email);
        dataBaseClients.saveClient(client);
    }

    public void createProduct(String name,String description,double price){
        Product product = new Product(createIdProduct(),name,description,price);
        dataBaseProducts.saveProduct(product);
    }
    
    public void createStore(String name){
        Store store = new Store(createIdStore(),name);
        ecommerce.saveStore(store);
    }
    
    public Client findClient(String nameClient){
        Client client = new Client();
        for (Client value :dataBaseClients.getClients()) {
            if(Objects.equals(nameClient, value.getUsername())){
                client = value;
            }
        }
        return client;
    }

    public Store findStore(String nameStore){
        Store store = new Store();
        for (Store value:ecommerce.getStores()) {
            if(Objects.equals(nameStore, value.getName())){
                store = value;
            }
        }
        return store;
    }

    public Product findProduct(String nameProduct){
        Product product = new Product();
        for (Product value:dataBaseProducts.getProducts()) {
            if(Objects.equals(nameProduct, value.getName())){
                product = value;
            }
        }
        return product;
    }

    public void storeSupply(String nameStore,String nameProduct){

        Store store = findStore(nameStore);
        Product product = findProduct(nameProduct);
        Set<Store> key = new HashSet<>();
        if(eventManager.getProductsSupply().keySet().equals(key)){
            eventManager.getProductsSupply().put(store,new ArrayList<>());
        }

        for (Store value :eventManager.getProductsSupply().keySet()) {
            if(Objects.equals(value.getName(), store.getName())){
                ArrayList<Product> products = eventManager.getProductsSupply().get(value);
                ArrayList<Client> subscribers= eventManager.getSubscribers().get(value);
                if(Objects.equals(subscribers, null)){
                    products.add(product);
                    eventManager.addProductSuppply(store,products);
                } else{
                    products.add(product);
                    eventManager.addProductSuppply(store,products);
                    eventManager.newProduct(store,product);
                }

            }else {
                eventManager.getProductsSupply().put(store,new ArrayList<>());
                storeSupply(nameStore,nameProduct);
            }
        }


    }

    public void storeStockouts(String nameStore,String nameProduct){
        ArrayList<Product> products;
        Store store = findStore(nameStore);
        Product product = findProduct(nameProduct);
        for (Store value :eventManager.getProductsSupply().keySet()) {
            if(Objects.equals(value.getName(), store.getName())){
                products = eventManager.getProductsSupply().get(value);
                products.remove(product);
                eventManager.removeProduct(store,product);
            }
        }
    }

    public void promotion(String nameStore,String nameProduct){
        ArrayList<Product> products;
        Store store = findStore(nameStore);
        Product product = findProduct(nameProduct);
        for (Store value :eventManager.getProductsSupply().keySet()) {
            if(Objects.equals(value.getName(), store.getName())){
                products = eventManager.getProductsSupply().get(value);
                for (Product productValue:products) {
                    if(Objects.equals(product.getName(), productValue.getName())){
                        eventManager.productOnPromotion(store,product);
                    }
                }
            }
        }
    }
    
    public void createSubscribers(String nameStore,String nameClient){

        ArrayList<Client> clients;
        Store store = findStore(nameStore);
        Client client = findClient(nameClient);

        Set<Store> key = new HashSet<>();
        if(eventManager.getSubscribers().keySet().equals(key)){
            eventManager.getSubscribers().put(store,new ArrayList<>());
        }

        for (Store value :eventManager.getSubscribers().keySet()) {
            if(Objects.equals(value.getName(), store.getName())){
                clients = eventManager.getSubscribers().get(value);
                ArrayList<Product> products = eventManager.getProductsSupply().get(store);
                if(products!= null ){
                    clients.add(client);
                } else System.out.println("No existe productos en la tienda, no es posible generar subscirptores");
            }else {
                eventManager.getSubscribers().put(store,new ArrayList<>());
                createSubscribers(nameStore,nameClient);
            }
        }

    }

    public void removeSubscribers(String nameStore,String nameClient){
        ArrayList<Client> clients;
        Store store = findStore(nameStore);
        Client client = findClient(nameClient);
        for (Store value :eventManager.getSubscribers().keySet()) {
            if(Objects.equals(value.getName(), store.getName())){
                clients = eventManager.getSubscribers().get(value);
                clients.remove(client);
            }
        }
    }

    public DataBaseClients getDataBaseClients() {
        return dataBaseClients;
    }

    public void setDataBaseClients(DataBaseClients dataBaseClients) {
        this.dataBaseClients = dataBaseClients;
    }

    public DataBaseProducts getDataBaseProducts() {
        return dataBaseProducts;
    }

    public void setDataBaseProducts(DataBaseProducts dataBaseProducts) {
        this.dataBaseProducts = dataBaseProducts;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public Ecommerce getEcommerce() {
        return ecommerce;
    }

    public void setEcommerce(Ecommerce ecommerce) {
        this.ecommerce = ecommerce;
    }
}
