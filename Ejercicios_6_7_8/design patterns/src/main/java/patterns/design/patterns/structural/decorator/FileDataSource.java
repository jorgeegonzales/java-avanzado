package patterns.design.patterns.structural.decorator;

public class FileDataSource implements DataSource{

    private  String filename;

    public FileDataSource() {
    }

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData() {
        System.out.println("Escribe datos en el archivo!");
    }

    @Override
    public void readData() {
        System.out.println("Lee datos en el archivo!");
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
