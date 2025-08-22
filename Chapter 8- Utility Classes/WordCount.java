import java.util.Scanner;

public class WordCount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userSentence = scanner.nextLine();

        String[] words = userSentence.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("This sentence has " + wordCount + " words!");

    }
}
