package patterns.design.patterns.behaviors.observer;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class EventManager {
    private Map<Store,ArrayList<Client>> subscribers;
    private Map<Store,ArrayList<Product>> productsSupply;

    public EventManager() {
    }

    public EventManager(Map<Store, ArrayList<Client>> subscribers, Map<Store, ArrayList<Product>> productsSupply) {
        this.subscribers = subscribers;
        this.productsSupply = productsSupply;
    }

    public void addProductSuppply(Store store,ArrayList<Product> products){

        productsSupply.put(store,products);
    }

    public void removeProductSuppply(Store store,ArrayList<Product> products){
        productsSupply.remove(store,products);
    }

    public void addSubscribers(Store store,ArrayList<Client> clients){
        subscribers.put(store,clients);
    }

    public void removeSubscribers(Store store,ArrayList<Client> clients){
        subscribers.remove(store,clients);
    }

    public void notifySubscribers(String event,Client client,Product product){
        if(Objects.equals(event, "newProduct")){
            System.out.println("Estimado: " + client.getUsername()
                    + " te estamos notificando de la existencia de un nuevo producto: "
                    + product.getName() + " al email: " + client.getEmail());
        } else if (Objects.equals(event, "productOnPromotion")){
            System.out.println("Estimado: " + client.getUsername()
                    + " te estamos notificando de la existencia de precios atractivos del producto: "
                    + product.getName() + " al email: " + client.getEmail());
        } else if(Objects.equals(event, "removeProduct")){
            System.out.println("Estimado: " + client.getUsername()
                    + " te estamos notificando que ya no existe en stock el producto: "
                    + product.getName() + " al email: " + client.getEmail());
        } else System.out.println("El evento ingresado no existe!");
    }

    public double attractivePrice(Product product){
        return (0.9*product.getPrice());
    }
    public void newProduct(Store store,Product product){
        for (Client value :getSubscribers().get(store)) {
            notifySubscribers("newProduct",value,product);
        }
    }

    public void productOnPromotion(Store store,Product product){
        for (Client value :getSubscribers().get(store)) {
            notifySubscribers("productOnPromotion",value,product);
        }
        product.setPrice(attractivePrice(product));
    }
    public void removeProduct(Store store,Product product){
        for (Client value :getSubscribers().get(store)) {
            notifySubscribers("removeProduct",value,product);
        }
    }

    public Map<Store,ArrayList<Client>> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Map<Store,ArrayList<Client>> subscribers) {
        this.subscribers = subscribers;
    }

    public Map<Store, ArrayList<Product>> getProductsSupply() {
        return productsSupply;
    }

    public void setProductsSupply(Map<Store, ArrayList<Product>> productsSupply) {
        this.productsSupply = productsSupply;
    }

    @Override
    public String toString() {
        return "EventManager{" +
                "subscribers=" + subscribers +
                ", productsSupply=" + productsSupply +
                '}';
    }
}
