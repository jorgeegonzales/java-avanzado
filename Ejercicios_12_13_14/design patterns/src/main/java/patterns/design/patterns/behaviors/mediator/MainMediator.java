package patterns.design.patterns.behaviors.mediator;
import patterns.design.patterns.behaviors.mediator.mediators.MediatorImplements;

/**
 *Mediator es un patrón de diseño de comportamiento que te permite reducir las dependencias caóticas entre objetos. El patrón restringe
 * las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.
 */
public class MainMediator {
    public static void main(String[] args) {
        MediatorImplements mediator = new MediatorImplements();

        System.out.println("MEDIATOR INTERVINIENDO EN LA CREACION DE UN CLIENTE");
        mediator.mediatorOperation(mediator.optionComponent("create"),"create","jorge");
        System.out.println("MEDIATOR INTERVINIENDO EN LA ACTUALIZACION DE UN CLIENTE");
        mediator.mediatorOperation(mediator.optionComponent("update"),"update","jorge");
        System.out.println("MEDIATOR INTERVINIENDO EN LA ELIMINACION DE UN CLIENTE");
        mediator.mediatorOperation(mediator.optionComponent("delete"), "delete","jorge");
    }
}
