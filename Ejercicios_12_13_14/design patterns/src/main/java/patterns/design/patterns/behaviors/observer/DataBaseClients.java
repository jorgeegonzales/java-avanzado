package patterns.design.patterns.behaviors.observer;

import java.util.ArrayList;

public class DataBaseClients {
    private ArrayList<Client> clients;

    public DataBaseClients() {
    }

    public DataBaseClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void saveClient(Client client){
        clients.add(client);
    }

    @Override
    public String toString() {
        return "DataBaseClients{" +
                "clients=" + clients +
                '}';
    }
}
