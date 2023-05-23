package patterns.design.patterns.behaviors.observer;

public class Store {
    private Integer id;
    private String name;
    private DataBaseProducts dataBaseProducts;
    private DataBaseClients dataBaseClients;

    private EventManager eventManager;
    private Product product;


    public Store() {
    }

    public Store(Integer id, String name) {
        this.id = id;
        this.name = name;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public DataBaseProducts getDataBaseProducts() {
        return dataBaseProducts;
    }

    public void setDataBaseProducts(DataBaseProducts dataBaseProducts) {
        this.dataBaseProducts = dataBaseProducts;
    }



    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
