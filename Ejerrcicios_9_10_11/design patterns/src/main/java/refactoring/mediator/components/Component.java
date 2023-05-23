package refactoring.mediator.components;


import refactoring.mediator.mediators.MediatorImplements;

/**
 * fix method signature
 */
public abstract class Component {
    public MediatorImplements mediator;

    public void setMediator(MediatorImplements mediator){
        this.mediator = mediator;
    }

    public abstract void operation(String event, String name);

    public abstract void ordena();

    public abstract void responde();

}
