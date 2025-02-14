public class ErrorLogs {
    public static void main(String[] args) {
        System.out.println("connecting to server"); //program attempts to establish connection
        System.out.println("error: connection timed out"); //attempt to connect to server failed--> too long
        System.out.println("Retrying..."); //will restart
    }
}
