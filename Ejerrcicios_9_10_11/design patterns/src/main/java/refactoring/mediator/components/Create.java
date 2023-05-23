package refactoring.mediator.components;

/**
 * running the hide delegate refactoring technique
 */
public class Create extends Component {



    public ExecuteCreate initializeExecutor(){
        return new ExecuteCreate();
    }

    @Override
    public void operation(String event, String name) {
        ExecuteCreate executeCreate = initializeExecutor();
        executeCreate.createExecute(event,name);
    }

    @Override
    public void ordena() {
        System.out.println("No doy ordenes, solo ejecuto las ordenes del cliente");
    }

    @Override
    public void responde() {
        System.out.println("Me han ordenado crear un cliente, soy la clase Create");
    }



}
