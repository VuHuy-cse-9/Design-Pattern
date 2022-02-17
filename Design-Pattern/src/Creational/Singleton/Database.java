package Creational.Singleton;

public class Database {
    private String type;
    private static Database database;
    private Database() {};
    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
