package patterns.design.patterns.behaviors.mediator.components;

public class Create extends Component{

    private ExecuteCreate executeCreate = new ExecuteCreate();
    @Override
    public void operation(String event, String name) {
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

    public ExecuteCreate getExecuteCreate() {
        return executeCreate;
    }

    public void setExecuteCreate(ExecuteCreate executeCreate) {
        this.executeCreate = executeCreate;
    }
}
