package patterns.design.patterns.behaviors.mediator.components;


import patterns.design.patterns.behaviors.mediator.mediators.MediatorImplements;

public abstract class Component {
    public MediatorImplements mediator;

    public void setMediator(MediatorImplements mediator){
        this.mediator = mediator;
    }

    public void operation(String event, String name) {
        // ejecute
    }

    public void ordena() {
        // ejecute
    }

    public void responde() {
        // ejecute
    }


}
