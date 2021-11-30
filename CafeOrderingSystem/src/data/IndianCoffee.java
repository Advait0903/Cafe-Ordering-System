package data;

public class IndianCoffee extends Coffee{
    public IndianCoffee(String id, String name, String description, String size, double price) {
        super(id, name, description, size, price);
    }

    @Override
    public String getCoffeeType() {
        return "INDIAN-COFFEE";
    }
}
