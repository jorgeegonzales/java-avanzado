package refactoring.mediator.mediators;


import refactoring.mediator.auxiliar.Client;
import refactoring.mediator.components.Component;
import refactoring.mediator.components.Create;
import refactoring.mediator.components.Delete;
import refactoring.mediator.components.Update;

import java.util.ArrayList;
import java.util.Objects;

/**
 * fixing the optionComponent method with the Extract Method ractorization technique.
 */
public class MediatorImplements extends Mediator {

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

    public Component optionComponent(String event ){
        Component client = new Client();
        client.ordena();

        if(Objects.equals(event, "create")){
            Component create = new Create();
            registra(client);
            registra(create);
            reenvia(client);
            return create;
        } else if (Objects.equals(event, "update")){
            Component update = new Update();
            registra(client);
            registra(update);
            reenvia(client);
            return update;
        } else if(Objects.equals(event, "delete")){
            Component delete = new Delete();
            registra(client);
            registra(delete);
            reenvia(client);
            return new Delete();
        } else {
            System.out.println("No existe componente para ese evento!");
        }
        return null;
    }

   public void mediatorOperation(Component component, String event, String name){
        component.operation(event,name);
   }



}
