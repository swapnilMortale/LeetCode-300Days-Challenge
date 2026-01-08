package Collections_Framework;

public class Product
{
    private String name;
    private double price;
    private int quantity;
    private String category;
    private boolean inStock;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
        this.category = "General";
        this.inStock = true;
    }

    public Product(String name, double price, int quantity, String category)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.inStock = (quantity > 0);
    }
    public Product(String name, double price, int quantity, String category, boolean inStock)
     {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return String.format("["+name+","+price+","+quantity+","+category+","+inStock+"]");
    }
}
