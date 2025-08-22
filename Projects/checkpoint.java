import java.util.Scanner;
import java.util.Set;

public class checkpoint {
    public static String petName;
    public static int hunger = 10;
    public static int energy =10;
    public static int social = 10;
    public static boolean playGame = true;

    //if pet has enough energy, will go to sleep! print ascii, message and stats:
    public static void printSleepBear() {
        System.out.println("""
            _,-""`""-~`)
            (`~_,=========\\
            |---,___.-.__,\\
            |        o     \\ ___  _,,,,_     _.--.
            \\      `^`    /`_.-"~      `~-;`     \\
            \\_      _  .'                 `,     |
                |`-                           \\'__/ 
                /                      ,_       \\  `'-. 
            /    .-""~~--.            `"-,   ;_    /
            |              \\               \\  | `""`
            \\__.--'`"-.   /_               |'
                        `"`  `~~~---..,     |
                                        \\ _.-'`-.
                                        \\       \\
                                        '.     /
                                            `"~`

        jgs""");
        System.out.println(String.format("%s is enjoying their beauty rest...", petName));
        printStats();
    }

    //if pet has enough energy, will eat food! print ascii, message and stats:
    public static void printEatBear(){
        System.out.println("""
            (()__(()
            /       \\ 
            ( /    \\  \\
            \\ o o    /
            (_()_)__/ \\             
            / _,==.____ \\
           (   |--|      )
          /\\_.|__|'-.__/\\_
          / (        /     \\ 
         \\  \\      (      /
          )  '._____)    /    
       (((____.--(((____/mrf
        """);
        System.out.println(String.format("%s is enjoying some delicious honey...", petName));
        printStats();
    }

    //if pet has enough energy, will play! print ascii, message and stats:
    public static void printPlayBear() {
        System.out.println("""
                            _         _
         .-""-.            ( )-"```"-( )           .-""-.
        / O O  \\          /            \\          /  O O \\
        |O .-.  \\        /   0 _ 0      \\        /  .-. O|
        \\ (   )  '.     _|     (_)       |     .'  (   ) /
          '.`-'     '-./ |                |`\\.-'    '-'.'
            \\         |  \\   \\     /   /  |          /
             \\        \\   '.  '._.'  .'   /         /
              \\        '.   `'-----'`   .'         /
               \\   .'    '-._        .-'\\   '.   /
                |/`          `'''''')    )    `\\|
                /                  (    (      ,\\
               ;                    \\   '-..-'/ ;
               |                     '.       /  |
               |                       `'---'`   |
               ;                                 ;
               \\                               /
                `.                           .'
                  '-._                   _.-'
            jgs    __/`"  '  - - -  ' "`` \\__
                /`            /^\\           `\\
                \\(          .'   '.         )/
                '.(__(__.-'       '.__)__).'
        """);
        System.out.println(String.format("%s loves to play in the snow...", petName));
        printStats();
    }

    //if pet has enough energy, will yap! print ascii, message and stats:
    public static void printYappingBear() {
        System.out.println("""
                '"'.        ___,,,___        .'``. 
              : (\\  `."'"```         ```"'"-'  /) ;
              :  \\                         `./  .'
              `.                            :.'
                /        _         _        \\
               |         0}       {0         |
               |         /         \\         |
               |        /           \\        |
               |       /             \\       |
                \\     |      .-.      |     /
                  `.   | . . /   \\ . . |   .'
              jgs   `-._\\.'.(     ).'./_.-'
                        `\\'  `._.'  '/'
                          `. --'-- .'
                            `-...-'
        """);
        System.out.println(String.format("%s loves to yap and get all the tea...", petName));
        printStats();
    }

    //method if eat is selected:
    public static void eatFood(){
        //check if they have energy to eat food
        if (energy>0){
            hunger += 4;
            energy -=2;
            printEatBear();
        }
        else{
           System.out.println(String.format("Sorry. %s doesn't want to eat right now.", petName));
        }
    }

    //method if sleep is selected:
    public static void getSleep(){
        energy += 4;
        social +=2;
        hunger -=1;
        printSleepBear();
        
    }
    public static void play(){
        if (energy>=2 && social>=2 && hunger>=3){
            energy -=2;
            hunger -=3;
            social +=2;
            printPlayBear();
        }
        else{
           System.out.println((String.format("Sorry. %s is too tired to play right now.", petName)));
        }
        
    }

    //method if yapping is selected
    public static void yapping(){
        if (social>=3 && hunger>=2 && energy>0){
            energy +=2;
            hunger -=2;
            social -=3;
            printYappingBear();
        }
        else{
            System.out.println((String.format("Sorry. %s doesn't want to yap with you right now.", petName)));
        }
    }

    //prints the opening message for the users about the pet/game:
    public static void printMenu(){
        System.out.println("");
    }

    //prints the stats of the pet:
    public static void printStats(){
        System.out.println(String.format("\n%s's stats: \nHunger: %d \nEnergy: %d \nSocial: %d", petName, hunger, energy, social));
    }

    //for the quit option:
    public static void quitOption(){
        playGame =false;
        System.out.println(String.format("Thanks for playing. %s will be waiting for your return!", petName));
    }

    //print options:
    public static void printOptions(){
        System.out.println("\n\nPlease Enter The Selection: \np for Play \ne for Eat \ns for Sleep \ny for Yap \nq for Quit: ");
           
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //prints the game description:
        printMenu();
        
        //asks for pet name:
        System.out.print("Please enter the name of your pet: ");
        petName= scan.next();
        
        //print pet's starting stats:
        printStats();
        
        //game loop:
        while (playGame){

            printOptions();
           //get the character entered (convert to lowercase for easy comparison)
           char selection = scan.next().charAt(0);
           selection = Character.toLowerCase(selection);
           
           //clear remaining entries
           scan.nextLine();

           //set the valid entries to use for reprompt loop:
           Set<Character> validSelections = Set.of('p', 'e', 's', 'q', 'y');
           
           //if invalid selection- reprompt til correct entry entered
           while (!validSelections.contains(selection)){
               System.out.println("Invalid Selection.");
               printOptions();
               selection = scan.next().charAt(0);
               selection = Character.toLowerCase(selection);
           } 
           
           //valid entry has been selected:
            if (selection == 'p'){
                play();
            }
            else if (selection=='e'){
                eatFood();
            }
            else if (selection == 's'){
                getSleep();
            }
            else if (selection == 'y'){
                yapping();
            }
            else{
                quitOption();
            }
        }
    }
}
