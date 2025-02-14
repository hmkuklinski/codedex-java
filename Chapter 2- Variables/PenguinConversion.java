import java.util.Scanner;

public class PenguinConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Please enter how many coins you have: ");
        double amt = scan.nextDouble();
        double result = amt* 0.0045;
        String resultStr =String.format("%.2f",result);
        System.out.println("You have " + resultStr + " USD");
    }
}
