package patterns.design.patterns.structural.decorator;

public class DataSourceDecorator implements DataSource{

    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData() {
        dataSource.writeData();
    }

    @Override
    public void readData() {
        dataSource.readData();
    }
}
