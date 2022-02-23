package Structural.Decorator;

public class ClientApplication {
    public void main() {
        boolean isEncrypt = true;
        boolean isCompressed = true;
        DataSource dataSource = new FileDataSource("Learn.cpp");
        if (isEncrypt) {
            dataSource = new EncryptionDecorator(dataSource);
        }
        if (isCompressed) {
            dataSource = new CompressionDecorator(dataSource);
        }

        dataSource.writeData("Data");
        dataSource.readData();
    }
}
