public class CookingMama {
    public static void main(String[] args) {
        System.out.println("Step 1: Melt 3 tablespoons of butter into a pan");
        System.out.println("Step 2: Add Salt, Pepper, Garlic Powder, Onion Powder, Paprika, and Cayenne Pepper");
        System.out.println("Step 3: Add 3 tablespoons of flour");
        System.out.println("Step 4: Add an entire can of evaporated milk, gradually.");
        System.out.println("Step 5: Add in two cups of heavy cream");
        System.out.println("Step 6: Add in your shredded cheese");
        System.out.println("Step 7: Add cooked noodles and mix the sauce together");
        System.out.println("Transfer to a baking dish and cook at 25 min on 350 degrees F");
        System.out.println("Serve and enjoy");

        //alternate option:
        System.out.println("\n\n-----------------------");
        String [] steps= {"Step 1: Melt 3 tablespoons of butter into a pan", 
        "Step 2: Add Salt, Pepper, Garlic Powder, Onion Powder, Paprika, and Cayenne Pepper",
        "Step 3: Add 3 tablespoons of flour", "Step 4: Add an entire can of evaporated milk, gradually.",
        "Step 5: Add in two cups of heavy cream","Step 6: Add in your shredded cheese",
        "Step 7: Add cooked noodles and mix the sauce together", "Transfer to a baking dish and cook at 25 min on 350 degrees F",
        "Serve and enjoy"
        };
        for(int i=0;i<steps.length;i++){
            System.out.println(steps[i]);
        }
    }
}
