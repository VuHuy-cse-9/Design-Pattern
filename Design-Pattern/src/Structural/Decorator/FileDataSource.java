package Structural.Decorator;

public class FileDataSource implements DataSource{
    private String filename;
    public FileDataSource(String filename) {
        this.filename = filename;
    }
    @Override
    public void writeData(String data) {
        System.out.println(filename + ": Write " + data);
    }
    @Override
    public String readData() {
        System.out.println(filename + ": read data");
        return "Data";
    }
}
