package patterns.design.patterns.behaviors.mediator.components;

public class Update extends Component{

    private ExecuteUpdate executeUpdate = new ExecuteUpdate();
    @Override
    public void operation(String event, String name) {
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
