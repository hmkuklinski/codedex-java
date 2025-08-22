public class MathPractice{
    public static int launchCalculator(double timeOne, double timeTwo){
        return (int)Math.round(timeOne*timeTwo);
    }
    public static void main(String[] args) {
        System.out.println(String.format("Rounded distance: %d meters", launchCalculator(5, 3)));

    }
}
