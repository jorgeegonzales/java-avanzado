package refactoring.mediator.mediators;

import refactoring.mediator.auxiliar.Client;
import refactoring.mediator.auxiliar.DataBaseClients;
import refactoring.mediator.auxiliar.Events;

import java.util.ArrayList;
import java.util.Objects;

public class MediatorServiceImplements extends MediatorService {
    private Events events = new Events();
    private DataBaseClients dataBaseClients = new DataBaseClients();

    private Client client;

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public DataBaseClients getDataBaseClients() {
        return dataBaseClients;
    }

    public void setDataBaseClients(DataBaseClients dataBaseClients) {
        this.dataBaseClients = dataBaseClients;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void initializeEvents(String event) {
        if(events.getEventos() == null){
            events.setEventos(new ArrayList<>());
            events.getEventos().add(event);
            System.out.println(events.getEventos());
        }
    }

    @Override
    public void initializeClient() {
        if(dataBaseClients.getClients()==null){
            dataBaseClients.setClients(new ArrayList<>());
        }
    }

    @Override
    public void create(String event, String name) {
        System.out.println("Voy a crear al cliente: " + name);
        initializeEvents(event);
        for (String value :events.getEventos()) {
            if(Objects.equals(value, event)){
                Client client = new Client(name);
                initializeClient();
                dataBaseClients.getClients().add(client.getName());
                System.out.println("Lista de clientes: " + getDataBaseClients().getClients());
                break;
            } else {
                events.getEventos().add(event);
                create(event,name);
            }
        }

    }

    @Override
    public void update(String event, String name) {
        System.out.println("Voy a actualizar al cliente: " + name);
        initializeEvents(event);
        for (String value :getEvents().getEventos()) {

            if(Objects.equals(value, event)){

                initializeClient();

                if(!dataBaseClients.getClients().remove(name)){
                    create(event,name);
                }
                dataBaseClients.getClients().remove(name);
                dataBaseClients.getClients().add(name + "Update");
                System.out.println("Lista de clientes luego de actualizar: " + dataBaseClients.getClients());
                break;

            } else {
                events.getEventos().add(event);
                update(event,name);
            }

        }
    }

    @Override
    public void delete(String event, String name) {
        System.out.println("Voy a eliminar los datos del cliente: " + name);
        initializeEvents(event);
        for (String value :getEvents().getEventos()) {

            if(Objects.equals(value, event)){

                initializeClient();

                if(!dataBaseClients.getClients().remove(name)){
                    create(event,name);
                }
                dataBaseClients.getClients().remove(name);
                System.out.println("Lista de clientes luego de eliminar: " + dataBaseClients.getClients());
                break;

            } else {
                events.getEventos().add(event);
                delete(event,name);
            }

        }
    }

    @Override
    public String findClient(String name) {
        initializeClient();

        for (String value:dataBaseClients.getClients()) {
            if(Objects.equals(value, name)){
                return value;
            }
        }
        return null;
    }


}
