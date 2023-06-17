package project.cleaned;

import project.cleaned.singleton.Client;
import project.cleaned.singleton.Product;
import project.cleaned.singleton.Provider;
import project.cleaned.singleton.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Operations {
    project.cleaned.OptionsArgs optionsArgs = new OptionsArgs();

    public void createEntity(String[] args){
        Map<String, String> parameters = optionsArgs.argsOptionsParameters(args);
        String[] valuesParameters = optionsArgs.argsArrayValuesParameters(parameters);
        for (String value:valuesParameters) {
            System.out.println(value);
        }
        String entity = valuesParameters[0];

        if(Objects.equals(entity, "Client") || Objects.equals(entity, "Provider")){
            createEntityPerson(valuesParameters);
        } else if (Objects.equals(entity, "Product")){
            createEntityProduct(valuesParameters);
        } else System.out.println("La entidad: " + entity + " no existe o no esta definida!");
    }

    public void createEntityPerson(String[] valuesParameters) {
        System.out.println("valuesParameters en createEntityPerson: " + Arrays.toString(valuesParameters));
        String entitdad = valuesParameters[0];
        String name = valuesParameters[1];
        Integer documentNumber = Integer.valueOf(valuesParameters[2]);
        String address = valuesParameters[3];
        String email = valuesParameters[4];
        Integer phone = Integer.valueOf(valuesParameters[5]);

        Service saveDatabase = new Service(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        switch (entitdad) {
            case "Client" -> {
                Client client = new Client(name, documentNumber, address, email, phone);
                saveDatabase.saveObject(client);
            }
            case "Provider" -> {
                Provider provider = new Provider(name, documentNumber, address, email, phone);
                saveDatabase.saveObject(provider);
            }
            default -> System.out.println("La entidad: " + entitdad + " no es valida!");
        }


    }

    public void createEntityProduct (String[] valuesParameters){
        String entitdad = valuesParameters[0];
        String name = valuesParameters[1];
        String description = valuesParameters[2];
        Integer stock = Integer.valueOf(valuesParameters[3]);
        double price = Double.parseDouble(valuesParameters[4]);

        Service saveDatabase = new Service(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        if (entitdad.equals("Product")) {
            Product product = new Product(name, description, stock, price);
            saveDatabase.saveObject(product);
        } else {
            System.out.println("La entidad: " + entitdad + " no es valida!");
        }


    }
}
