public class TvChannels{

    // This method multiplies the channel codes and returns the result 📺
    public static int multipy(int[] channelCodes) {
        int result = 1;
        for (int i = 0; i < channelCodes.length; i++) {
            result *= channelCodes[i];
        }
        return result;
    }

    // Create first method here 💖
    public static double multiply(double val1, double val2){
        return val1*val2;
    }


    // Create second method here 💖
    public static int multiply(int val1, int val2, int val3){
        return val1*val2*val3;
    }

    public static void main(String[] args) {
        System.out.println("The result is" + multipy(new int[] { 1, 2, 3, 4, 5 }));  
        System.out.println("The result is " + multiply(13, 8));
        System.out.println("The result is " + multiply(7, 9));
        System.out.println("The result is " + multiply(233.9, 0.09));  
        System.out.println("The result is " + multiply(0.1, 0.1));
    }
}