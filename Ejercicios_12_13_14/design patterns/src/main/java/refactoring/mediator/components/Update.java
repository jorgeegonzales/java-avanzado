package refactoring.mediator.components;

/**
 * running the hide delegate refactoring technique
 */
public class Update extends Component {

    public ExecuteUpdate initializeExecutor(){
        return new ExecuteUpdate();
    }
    @Override
    public void operation(String event, String name) {

        ExecuteUpdate executeUpdate = initializeExecutor();
        executeUpdate.updateExecute(event,name);
    }
    @Override
    public void ordena() {
        System.out.println("No doy ordenes, solo ejecuto las ordenes del cliente");
    }

    @Override
    public void responde() {
        System.out.println("Me han ordenado actualizar un cliente, soy la clase Update");
    }
}
