package Collections_Framework;


import java.util.ArrayList;

public class ProductDriver
{
    public static void main(String[] args)
    {
        ArrayList<Product> arrayList = new ArrayList<>() ;

        arrayList.add(new Product("Laptop", 999.99));
        arrayList.add(new Product("Mouse", 25.50));
        arrayList.add(new Product("Keyboard", 75.00));


        arrayList.add(new Product("Monitor", 299.99, 5, "Electronics"));
        arrayList.add(new Product("Headphones", 149.99, 0, "Audio"));
        arrayList.add(new Product("Tablet", 399.99, 10, "Electronics"));

        arrayList.add(new Product("Printer", 199.99, 3, "Electronics", true));
        arrayList.add(new Product("Scanner", 89.99, 0, "Electronics", false));
        arrayList.add(new Product("Webcam", 45.50, 15, "Electronics", true));

        for (Product product : arrayList) {
            System.out.println(product);
        }

    }
}
