/**
 * YOU MADE IT TO THE END OF CHAPTER 7! 🎉
 * We've learned a lot about classes and objects in Java.... but we're not done yet! 😅
 * Inspired by the mobile game "Good Coffee, Great Coffee" ☕️☕️☕️☕️☕️
 */


// Create a new class named Order here! 💖
class Order{
    String orderName;
    String drinkName;
    double price;
    boolean isHot;
    char size;
    boolean toGo;
    String sizeStr;
    String hotCold;

    public Order(String order, String drink, double price, boolean isHot, char size, boolean toGo){
        this.orderName = order;
        this.drinkName= drink;
        this.price = price;
        this.isHot = isHot;
        this.size = size;
        this.toGo = toGo;

    }
    @Override
    public String toString(){
        return "Order for " + this.orderName + ": " + this.drinkName + " Size: " + this.size + " iced? " + this.isHot;
    }

}


public class coffee {
    public static void main(String[] args) {
        // Create a new Order object here! 💖
        Order elliot = new Order("Elliot","Matcha Latte", 6.99, false, 'L', false);
        Order kate = new Order("Kate", "Espresso", 4.99, true, 'M', true);
        Order allison = new Order("Allison", "Mocha Latte", 7.99, false, 'L', false);


        // Add print statements here! 💖
        System.out.println(elliot.toString());
        System.out.println(kate.toString());
        System.out.println(allison.toString());

        
    }


}
