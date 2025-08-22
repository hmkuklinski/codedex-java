import java.util.Scanner;
import java.util.Random;

public class RandomGuess{
    public static void main(String[] args) {
        //establish rand and scan object:
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //prompt user for entry:
        System.out.print("Think of a number between 1 and 10: ");

        //get user's selection and computer's selection:
        int userSelection = scan.nextInt();
        int randomNum = rand.nextInt(11);

        //print out computer's guess:
        System.out.println(String.format("💻 The computer guesses: %d", randomNum));
        
        //print out answer
        if (randomNum == userSelection){
            System.out.println("✔️ The computer guessed right!");
        }
        else{
            System.out.println("❌ The computer guessed wrong!");
        }

    }
}
