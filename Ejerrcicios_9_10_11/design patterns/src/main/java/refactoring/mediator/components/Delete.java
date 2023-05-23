package refactoring.mediator.components;

/**
 * running the hide delegate refactoring technique
 */
public class Delete extends Component {

    public ExecuteDelete initializeExecutor(){
        return new ExecuteDelete();
    }
    @Override
    public void operation(String event, String name) {
        ExecuteDelete executeDelete = initializeExecutor();
        executeDelete.deleteExecute(event,name);
    }

    @Override
    public void ordena() {
        System.out.println("No doy ordenes, solo ejecuto las ordenes del cliente");
    }

    @Override
    public void responde() {
        System.out.println("Me han ordenado eliminar un cliente, soy la clase Delete");
    }
}
