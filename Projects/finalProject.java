import java.util.Scanner;
import java.util.Set;

public class finalProject{
    public static void main(String[] args) {
        //establish the scanner object and the boolean flag to initialize the loop on start
        Scanner scan = new Scanner(System.in);
        boolean runLoop = true;

        //no additional arguments or flags passed --> run program Cipher Loop
        if (args.length == 0){
            cipherLoop(scan, runLoop);
        }
        //a flag of -d, -decrypt, or -decryption was entered when running program --> run decryption option (bypass input on type of operation), then run program Cipher Loop
        else if (args[0].equals("-d")|| args[0].equals("-decrypt")|| args[0].equals("-decryption")){
            System.out.println("Welcome to the Caesar Cipher program.");
            performOperation(scan, "decrypt");
            cipherLoop(scan, runLoop);
        }
        //a flag of -e, -encrypt, or -encryption was entered when running program --> run encryption option (bypass input on type of operation), then run program Cipher Loop
        else if (args[0].equals("-e" )|| args[0].equals("-encrypt")|| args[0].equals("-encryption")){
            System.out.println("Welcome to the Caesar Cipher program.");
            performOperation(scan, "encrypt");
            cipherLoop(scan, runLoop);
        }
        //a flag of -h or -help to display possible flags user can pass:
        else if (args[0].equals("-h") || args[0].equals("-help")){
            System.out.println("You've typed the help command. Here is how you can use the flags!");
            System.out.println("type in: \"java fileName [flag] \"");
            System.out.println("Possible flags: \n-d, -decrypt, or -decryption to run the decryption option\n-e or -encrypt or -encryption to run the encryption option");
        }
    }

    //the main loop of the program--> prompts user for decryption, encryption or quit option and runs performOperation based on input
    //param: Scanner object scan to allow for user input, boolean runLoop (default is true to run at least once)
    public static void cipherLoop(Scanner scan, boolean runLoop){
        while (runLoop){
            //print main menu for program:
            System.out.println("\nWelcome to the Caesar Cipher program. Please type in your selection: \n1) Encryption\n2) Decryption\n3) Quit");
            System.out.print("Selection: ");
            //get user's selection:
            String userInput = scan.nextLine();
            
            //all valid inputs user could select: first intial, corresponding number, shortened word, full word
            Set<String> validInputs = Set.of("d", "e", "decrypt", "encrypt", "decryption", "encryption", "1", "2", "quit", "q", "3");

            //if not in the validInputs, reprompt user for valid entry:
            while (!validInputs.contains(userInput.toLowerCase())){
                System.out.println("\nInvalid entry. Please type a selection from the menu: \n1) Encryption\n2) Decryption\n3) Quit ");
                userInput = scan.nextLine();
            }
            
            //user has selected decryption: run performOperation, passing in scanner object and the keyType "decrypt"
            if (userInput.equalsIgnoreCase("decrypt") || userInput.equalsIgnoreCase("d") || userInput.equals("1")){
                performOperation(scan, "decrypt");
            }
            //user has selected encryption: run performOperation, passing in scanner object and the keyType "encrypt"
            else if (userInput.equalsIgnoreCase("encrypt") || userInput.equalsIgnoreCase("e" )|| userInput.equals("2")){
                performOperation(scan, "encrypt");
            }
            //user has selected the quit option: boolean flag to false and exit message:
            else{
                runLoop=false;
                System.out.println("Thank you for using the Caesar Cipher program!");
            }
        }
    }

    //this method gets the string that the user is trying to decrypt/encrypt, along with the shift key, to perform the specified operation
    //param: Scanner object scan to get user input, keyType of "encrypt" or "decrypt"
    public static void performOperation(Scanner scan, String keyType){
        
        //will print "Enter the string you are trying to encrypt" or "Enter the string you are trying to decrypt" (based on what's passed)
        System.out.println(String.format("\nEnter the string you are trying to %s: ", keyType));
        
        //get user's sentence:
        String enteredString = scan.nextLine();

        //prompt and store the user's shift key:
        System.out.print("Enter the shift key: ");
        int shiftKey = scan.nextInt();

        //clear the scanner:
        scan.nextLine();

        //print the secret message: where message checks value of keytype to call actual operation function (which returns string that will be placed in %s)
        System.out.println(String.format("\nYour secret message is \"%s\"",
            (keyType.equals("decrypt") ? decrypt(enteredString, shiftKey) : encrypt(enteredString, shiftKey))
        ));
        
    }

    //the decrypt operation function --> responsible for shifting the string back to its original values
    //params: String text is the text we're trying to decrypt, int shift is the shift key
    public static String decrypt(String text, int shift){
        //Store the result in a StringBuilder:
        StringBuilder result = new StringBuilder();

        //loop that checks if each character is a letter and performs shift based on whether base is lower or upper case:
        for (int i=0;i<text.length();i++){
            
            //character at current index:
            char ch = text.charAt(i);

            //is character a letter? do operations to shift and add the shifted value: add the character (not letter, can't be shifted!)
            if (Character.isLetter(ch)){
                char base = Character.isLowerCase(ch)? 'a': 'A';
                char shifted = (char)((ch - base - shift + 26) % 26 + base);
                result.append(shifted);
            }
            else{
                result.append(ch);
            }
        }
        //returning string, so need to use .toString() to get String of our StringBuilder result
        return result.toString(); 
    }
   
    //the encrypt operation function --> responsible for shifting the string to a different character
    //params: String text is the text we're trying to encrypt, int shift is the shift key
    public static String encrypt(String text, int shift){
        StringBuilder result = new StringBuilder();
       
        //loop that checks if each character is a letter and performs shift based on whether base is lower or upper case:
        for (int i=0;i<text.length();i++){
           
            //character at current index:
            char ch = text.charAt(i);

            //is character a letter? do operations to shift and add the shifted value: add the character (not letter, can't be shifted!)
            if (Character.isLetter(ch)){
                char base = Character.isLowerCase(ch)? 'a': 'A';
                char shifted = (char)((ch-base+shift+26)%26+base);
                result.append(shifted);
            }
            else{
                result.append(ch);
            }
        }
        //returning string, so need to use .toString() to get String of our StringBuilder result
        return result.toString();
    }
}

