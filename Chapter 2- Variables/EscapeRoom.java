import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I? \n");
        System.out.print("Enter your answer: ");
        String answer = scan.nextLine();
        System.out.println("Your answer: " + answer);
        System.out.println("Congratulations! :D");
    }
}
