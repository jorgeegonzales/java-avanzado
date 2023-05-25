package patterns.design.patterns.behaviors.mediator.mediators;


import patterns.design.patterns.behaviors.mediator.auxiliar.Client;
import patterns.design.patterns.behaviors.mediator.components.*;

import java.util.ArrayList;
import java.util.Objects;

public class MediatorImplements extends Mediator {

    public Component optionComponent(String event ){
        if(Objects.equals(event, "create")){
            Component client = new Client();
            Component create = new Create();
            registra(client);
            registra(create);
            client.ordena();
            create.responde();
            return create;
        } else if (Objects.equals(event, "update")){
            Component client = new Client();
            Component update = new Update();
            registra(client);
            registra(update);
            client.ordena();
            update.responde();
            return update;
        } else if(Objects.equals(event, "delete")){
            Component client = new Client();
            Component delete = new Delete();
            registra(client);
            registra(delete);
            client.ordena();
            delete.responde();
            return new Delete();
        } else {
            System.out.println("No existe componente para ese evento!");
        }
        return null;
    }

   public void mediatorOperation(Component component,String event,String name){
        component.operation(event,name);
   }

    ArrayList<Component> components = new ArrayList<>();
    @Override
    void registra(Component component) {
        if(!components.contains(component)){
            components.add(component);
            component.setMediator(this);
        }
    }

    @Override
    void reenvia(Component component) {
        for(Component actual : components){
            if(!actual.equals(component)){
                actual.responde();
            }
        }
    }

}
