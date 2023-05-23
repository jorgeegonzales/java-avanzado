package refactoring.mediator.auxiliar;

import refactoring.mediator.components.Component;

public class Client extends Component {
    private String name;


    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void operation(String event, String name) {
        System.out.println("Yo delego las operaciones a otros componentes");
    }

    @Override
    public void ordena() {
        System.out.println("He ordenado que se haga una operacion sobre un cliente, soy la clase Client");
    }

    @Override
    public void responde() {
        System.out.println("No doy respuestas a peticiones, soy la clase Client");
    }
}
