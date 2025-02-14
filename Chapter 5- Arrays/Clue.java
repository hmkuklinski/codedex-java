import java.util.Arrays;

public class Clue {
    public static void main(String[] args) {
        // Write your code here 💖
        String[] arr = {"ASDFDFA", "34958234985234820934", "243082304920394",  "ASDFAFMMMMMMMMM99999999", "12212112", "23094230482" };
        Arrays.sort(arr);
        String sortedPasswords = "";
        for(int i=0;i<3;i++){
            sortedPasswords += arr[i];
        }
        System.out.println(sortedPasswords);
        
    }
}
