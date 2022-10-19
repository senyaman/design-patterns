package pattern.proxy;

public class Main {
    public static void main(String[] args) {
        Database database = new DatabaseProxy();
        database.connectTo("customer-db");
    }
}
