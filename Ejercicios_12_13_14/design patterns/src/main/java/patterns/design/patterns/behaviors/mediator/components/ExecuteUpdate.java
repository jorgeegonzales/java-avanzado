package patterns.design.patterns.behaviors.mediator.components;

import patterns.design.patterns.behaviors.mediator.mediators.MediatorServiceImplements;

public class ExecuteUpdate extends MediatorServiceImplements {



//    public void createExecute(String event, String name) {
//        System.out.println("Voy a crear al cliente: " + name);
//        initializeEvents(event);
//        for (String value :getEvents().getEventos()) {
//            if(Objects.equals(value, event)){
//                Client client = new Client(name);
//                if(getDataBaseClients().getClients()==null){
//                    getDataBaseClients().setClients(new ArrayList<>());
//                }
//                getDataBaseClients().getClients().add(client.getName());
//                System.out.println("Lista de clientes: " + getDataBaseClients().getClients());
//                break;
//            } else {
//                getEvents().getEventos().add(event);
//                createExecute(event,name);
//            }
//        }
//
//    }

    public void updateExecute(String event, String name) {
        update(event,name);
    }


}
