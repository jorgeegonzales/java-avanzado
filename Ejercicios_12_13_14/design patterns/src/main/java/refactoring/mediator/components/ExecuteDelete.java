package refactoring.mediator.components;

import refactoring.mediator.mediators.MediatorServiceImplements;

public class ExecuteDelete extends MediatorServiceImplements {
    public void deleteExecute(String event, String name) {
        delete(event,name);
    }

}
