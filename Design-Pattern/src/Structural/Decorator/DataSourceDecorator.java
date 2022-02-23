package Structural.Decorator;

public abstract class DataSourceDecorator implements DataSource{
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    public abstract void writeData(String data);
    public abstract String readData();
}
