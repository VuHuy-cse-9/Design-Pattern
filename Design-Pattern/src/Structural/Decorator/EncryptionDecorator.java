package Structural.Decorator;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encryption: " + data);
        this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Descryption: read data");
        String data = this.wrappee.readData();
        return data + "Data";
    }   
}
