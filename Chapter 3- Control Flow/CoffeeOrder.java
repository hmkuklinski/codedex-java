public class CoffeeOrder {
    public static void main(String[] args) {
        boolean isLatte, isIced, withMatcha;
        int itemsOrdered, vanillaPumps;
        isLatte = true;
        isIced = true;
        withMatcha = false;
        itemsOrdered = 3;
        vanillaPumps = 6;
        
        if(isLatte && !withMatcha){
          System.out.println("esspresso, milk, ice, syrup");
        }
        else if (isLatte && withMatcha){
          System.out.println("matcha, oat milk, ice, vanilla");
        }
        else if (isLatte){
          System.out.println("espresso, steamed milk");
        }
        else{
          System.out.println("select a drink to get started!");
        }


        if (itemsOrdered>1){
          System.out.println("provide cup holder");
        }
        if (vanillaPumps>2){
          System.out.println("charge $1 extra");
        }
        
        
    }
}
