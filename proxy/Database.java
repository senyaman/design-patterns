package pattern.proxy;

public interface Database {
    void connectTo(String name);
}

class Connection implements Database {
    @Override
    public void connectTo(String name) {
        System.out.println("Connected localhost:8080/"+name);
    }
}

class DatabaseProxy implements Database{

    private final Database database = new Connection();

    @Override
    public void connectTo(String name) {
        if(!name.equalsIgnoreCase("customer-db")) {
            System.out.println("Cant reach localhost:8080/"+name);
        } else {
            database.connectTo(name);
        }
    }
}



