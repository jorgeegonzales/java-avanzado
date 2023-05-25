package patterns.design.patterns.behaviors.observer;

import java.util.ArrayList;

public class Ecommerce {
    private ArrayList<Store> stores;

    private Store store;

    public Ecommerce() {
    }

    public Ecommerce(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public boolean saveStore(Store store){
        return stores.add(store);
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public void setStores(ArrayList<Store> stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "Ecommerce{" +
                "stores=" + stores +
                '}';
    }
}
