package patterns.design.patterns.creational.prototype;

import java.util.ArrayList;

/**
 * Prototype es un patron de diseño creacional que nos permite hacer una copia exacta de un objeto, es decir clonarlo.
 * El patrón Prototype delega el proceso de clonación a los propios objetos que están siendo clonados.Para esto el
 * patron declara una interfaz comun con un metodo clonar(),para todos los objetos que soportaran la clonacion(Prototype).
 * Este metodo clonar se implementara en la clase de los objetos a ser clonados(Prototype).
 */
public class AppPrototype {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        circle.setRadius(5);
        shapes.add(circle);

        Circle cloneCircle = (Circle) circle.clone();
        shapes.add(cloneCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(8);
        rectangle.setHeight(4);
        shapes.add(rectangle);

        Rectangle cloneRectangle = (Rectangle) rectangle.clone();
        shapes.add(cloneRectangle);

        System.out.println("Esto es un arraylist de objetos originales y sus clones!");
        System.out.println(shapes);
    }
}
