package refactoring.mediator.mediators;

import refactoring.mediator.components.Component;

/**
 * fix method signature
 */
public abstract class Mediator {

    public abstract void mediatorOperation(Component component, String event, String name);

    abstract void registra(Component component);
    abstract void reenvia(Component component);

}
