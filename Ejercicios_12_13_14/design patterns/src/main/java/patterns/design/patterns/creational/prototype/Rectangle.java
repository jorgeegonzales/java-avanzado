package patterns.design.patterns.creational.prototype;

public class Rectangle extends Shape {
    private Integer width;
    private Integer height;

    public Rectangle() {
    }

    public Rectangle (Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
