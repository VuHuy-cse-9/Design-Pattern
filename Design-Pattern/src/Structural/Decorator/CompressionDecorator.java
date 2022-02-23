package Structural.Decorator;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compression: " + data); 
        this.wrappee.writeData(data); 
    }

    @Override
    public String readData() {
        System.out.println("Decompression: data");
        String data = this.wrappee.readData();
        return data + "Data";
    }
}
