package pattern.singleton;

public class Main {

    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        System.out.println("logging: " + instance1);

        Logger instance2 = Logger.getInstance();
        System.out.println("logging: " + instance2);
    }
}
