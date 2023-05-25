package patterns.design.patterns.behaviors.mediator.mediators;

import patterns.design.patterns.behaviors.mediator.components.Component;

public abstract class Mediator {

    public void mediatorOperation(Component component, String event, String name) {
        // ejecute
    }

    abstract void registra(Component component);
    abstract void reenvia(Component component);

}
