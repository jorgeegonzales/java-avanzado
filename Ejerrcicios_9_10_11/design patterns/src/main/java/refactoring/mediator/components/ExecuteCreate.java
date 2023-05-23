package refactoring.mediator.components;

import refactoring.mediator.mediators.MediatorServiceImplements;

public class ExecuteCreate extends MediatorServiceImplements {

    public void createExecute(String event, String name) {
            create(event,name);
    }


}
