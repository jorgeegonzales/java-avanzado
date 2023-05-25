package patterns.design.patterns.behaviors.mediator.components;

import patterns.design.patterns.behaviors.mediator.mediators.MediatorServiceImplements;

public class ExecuteDelete extends MediatorServiceImplements {
    public void deleteExecute(String event, String name) {
        delete(event,name);
    }

}
