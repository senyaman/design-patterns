package pattern.factory;

public class CoffeeFactory {

    public static Coffee getInstance(String type) {

        if(type.equalsIgnoreCase("americano")) {
            return new Americano(type);
        } else if (type.equalsIgnoreCase("espresso")) {
            return new Espresso(type);
        }

        return null;

    }

}
