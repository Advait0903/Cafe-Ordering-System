package data;

public abstract class Coffee implements Comparable<Coffee> {
    protected String id;
    protected String name;
    protected String description;
    protected String size;
    protected double price;

    public Coffee(String id, String name, String description, String size, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Print out coffee information
    public void showInfo() {
        String msg;
        msg = String.format("|%-20s|%5s|%-20s|%-40s|%2s%2s|%,16.0f|\n", getCoffeeType(), id, name, description, size, "", price);
        System.out.println(msg);
        //print the coffee info like Exel format
    }

    //Get the type of coffee
    public abstract String getCoffeeType();

    @Override
    public int compareTo(Coffee that) {
        return this.id.compareToIgnoreCase(that.id);
    }
}

