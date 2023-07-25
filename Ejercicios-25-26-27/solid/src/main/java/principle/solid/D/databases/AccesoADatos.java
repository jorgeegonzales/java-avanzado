package principle.solid.D.databases;

public class AccesoADatos {
    private Conexion conexion;

    public AccesoADatos(Conexion conexion){
        this.conexion = conexion;
    }

    public CarDB getDataBase(){
        return conexion.getDataBase();
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
}
