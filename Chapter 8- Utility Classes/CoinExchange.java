import java.util.Scanner;
import java.util.Random;

public class CoinExchange {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    System.out.println("What is your $USD balance?");
    double userInput = scan.nextDouble();

    double rupeeInflation = -0.03 + (0.5-0.03)* random.nextDouble();
    double gilInflation = -0.03 + (0.5-0.03)* random.nextDouble();
    double goldenInflation = -0.03 + (0.5-0.03)* random.nextDouble();

    double rupeeConv = 0.44;
    double gilConv = 54.87;
    double goldenConv = 2.23;

    System.out.println("\nYour rates today are:\n--------------- ");
    System.out.println(String.format("Rupees: \t%.2f", userInput*rupeeInflation*rupeeConv));
    System.out.println(String.format("Gil: \t\t%.2f", userInput*gilInflation*gilConv));
    System.out.println(String.format("Golden Coins: \t%.2f", userInput*goldenInflation*goldenConv));

  }
}
