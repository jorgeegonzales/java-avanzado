package patterns.design.patterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData() {
        System.out.println("1. Encripta los datos pasados!");
        System.out.println("2. Pasa los datos encriptados al metodo WriteData del objeto envuelto");
        super.writeData();
    }

    @Override
    public void readData() {
        super.readData();
        System.out.println("1. Obtiene datos del método readData del objeto envuelto");
        System.out.println("2. Intenta descifrarlo si esta encriptado");
        System.out.println("3. Devuelve el resultado");
    }
}
