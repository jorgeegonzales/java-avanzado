package patterns.design.patterns.behaviors.mediator.auxiliar;

import java.util.ArrayList;

public class DataBaseClients {
    private ArrayList<String> clients;

    public DataBaseClients() {
    }

    public ArrayList<String> getClients() {
        return clients;
    }

    public void setClients(ArrayList<String> clients) {
        this.clients = clients;
    }
}
