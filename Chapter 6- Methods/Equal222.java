public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("The first method is " + isEqual222(47, 85, 90));  
        System.out.println("The second method is " + isEqual222(90, 10, 47));
        System.out.println("The third method is " + isEqual222(30, 80, 82));  
    }
    public static boolean isEqual222(int val1, int val2, int val3){
        return ((val1+val2+val3)==222);
    }
}
