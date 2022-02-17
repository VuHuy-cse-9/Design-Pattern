package Creational.Singleton;

public class ClientApplication {
    public void main() {
        Database database = Database.getInstance();
        database.setType("SQL");
        System.out.println(database.getType());

        Database database2 = Database.getInstance();
        database.setType("NOSQL");
        System.out.println(database.getType());
    }
    
}
