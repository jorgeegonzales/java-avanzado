package refactoring.mediator.components;

import refactoring.mediator.mediators.MediatorServiceImplements;

public class ExecuteUpdate extends MediatorServiceImplements {

    public void updateExecute(String event, String name) {
        update(event,name);
    }

}
