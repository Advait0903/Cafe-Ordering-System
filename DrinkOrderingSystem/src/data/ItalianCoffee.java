package data;

public class ItalianCoffee extends Coffee {
    public ItalianCoffee(String id, String name, String description, String size, double price) {
        super(id, name, description, size, price);
    }

    @Override
    public String getCoffeeType() {
        return "ITALIAN-COFFEE";
    }
}
