public class DogOwner {
    public static void main(String[] args) {
        boolean isCatOwner = true;
        boolean isDogOwner = true;
        if (isCatOwner && !isDogOwner)
          System.out.println("Use the code MEOW for 20% off cat items.");
        else if (isDogOwner && !isCatOwner)
          System.out.println("Use the code WOOF for 20% off dog items.");
        else if (isCatOwner && isDogOwner)
          System.out.println("Use the code MEOW for 20% off cat items and WOOF for 20% off dog items");
        else
          System.out.println("Welcome to the pet store");
        
    }
}
