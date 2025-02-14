public class EarthsMoon{
    
    public static double earthMoonWeight(int weight){
        double moonWeight = weight* (1.62/9.81);
        return moonWeight;
    }
    public static void printStatement(String name, int weight, String unit){
        double moonWeight = earthMoonWeight(weight);
        System.out.println("Hi " + name + "! Your weight on Earth is "+ weight+ unit+ " and your weight on the moon would be about "+ moonWeight + unit+".");
    }

    public static void main(String[] args) {
        printStatement("Hannah", 165, "lbs");

    }
    
}
