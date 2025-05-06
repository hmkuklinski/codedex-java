class Product {
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}

public class iMacs {
    public static void main(String[] args) {
        // Creating new Product objects
        Product fit1 = new Product("T-Shirt", 44.99);
        Product fit2 = new Product("Jeans", 69.99); 

        System.out.println(fit1.name + " " + fit1.price); // Output: T-Shirt 44.99
        System.out.println(fit2.name + " " + fit2.price);
        
    }
}
