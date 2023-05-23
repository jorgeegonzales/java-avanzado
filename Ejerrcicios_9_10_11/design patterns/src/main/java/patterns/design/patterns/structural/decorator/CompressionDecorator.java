package patterns.design.patterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData() {
        System.out.println("1. Comprime los datos pasados.");
        System.out.println("2. Pasa los datos comprimidos al método writeData del objeto envuelto");
        super.writeData();
    }

    @Override
    public void readData() {
        super.readData();
        System.out.println("1. Obtiene datos del método readData del objeto envuelto");
        System.out.println("2. Intenta descomprimirlo si está comprimido.");
        System.out.println("3. Devuelve el resultado");
    }
}
