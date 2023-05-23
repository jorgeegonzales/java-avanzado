package patterns.design.patterns.behaviors.mediator.components;

public class Delete extends Component{

    private ExecuteDelete executeDelete = new ExecuteDelete();
    @Override
    public void operation(String event, String name) {
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
