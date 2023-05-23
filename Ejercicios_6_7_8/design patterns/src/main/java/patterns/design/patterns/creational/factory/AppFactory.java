package patterns.design.patterns.creational.factory;

/**
 * Factory Method es un patron de diseño que te permite crear objetos desde un metodo fabrica, los objetos devueltos por el metodo fabrica se denominan
 * productos.Hay una pequeña limitación: las subclases sólo pueden devolver productos de distintos tipos si dichos productos tienen una clase base
 * o interfaz común.
 */
public class AppFactory {
    public static void main(String[] args) {
        PlanLogistics planLogistics = new PlanLogistics();
        Vehiculo road = planLogistics.planLogistics("Road");
        System.out.println(road);

        Vehiculo sea = planLogistics.planLogistics("Sea");
        System.out.println(sea);
    }

}
