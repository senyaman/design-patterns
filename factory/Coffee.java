package pattern.factory;

public class Coffee {

    private final String type;

    public Coffee(String type) {
        this.type = type;
    }

    public void message() {
        System.out.println("Enjoy your " + this.type);
    }

}
