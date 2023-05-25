package patterns.design.patterns.behaviors.observer;

public class Product {
    private Integer id;
    private String name;
    private String Description;

    private double price;

    public Product() {
    }

    public Product(Integer id, String name, String description,double price) {
        this.id = id;
        this.name = name;
        Description = description;
        this.price = price ;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                '}';
    }
}
