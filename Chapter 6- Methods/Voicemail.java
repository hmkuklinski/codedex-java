public class Voicemail {

    // This method will check if the phone number is valid and if it is a spam call 📞
    public static void willCallBack(String phoneNum) {
        if (phoneNum.length() != 10) {
            System.out.println("Unfortunately, " + phoneNum + " is not a valid phone number.");
            return;
        }
    
        if (!phoneNum.matches("\\d+")) {
            System.out.println("You have invalid characters in " + phoneNum);
            return;
        }
    
        if (phoneNum.startsWith("800")) {
            System.out.println("The number " + phoneNum + " might be a spam call.");
            return;
        }
    
        System.out.println("There is one voicemail message from " + phoneNum + ".");
    }

        
    public static void main(String[] args) {

        // Call the method for each phone number here 💖
        willCallBack("1234567890");
        willCallBack("8005551234");
        willCallBack("987654321");
        willCallBack("12345abcd1");
        willCallBack("4567890123");

        System.out.println("\nChallenging way!");
        String[] mynums = {"1234567890","8005551234", "987654321","12345abcd1","4567890123" };
        for(int i=0;i<mynums.length;i++){
            willCallBack(mynums[i]);
        }

    }
}
