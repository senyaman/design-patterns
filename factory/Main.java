package pattern.factory;

public class Main {
    public static void main(String[] args) {

        Coffee americano = CoffeeFactory.getInstance("americano");
        Coffee espresso = CoffeeFactory.getInstance("espresso");

    }
}
