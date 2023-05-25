package patterns.design.patterns.behaviors.mediator.components;

import patterns.design.patterns.behaviors.mediator.auxiliar.Client;
import patterns.design.patterns.behaviors.mediator.mediators.MediatorServiceImplements;

import java.util.ArrayList;
import java.util.Objects;

public class ExecuteCreate extends MediatorServiceImplements {

    public void createExecute(String event, String name) {
            create(event,name);
    }


}
