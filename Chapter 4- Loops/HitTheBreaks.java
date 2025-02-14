public class HitTheBreaks {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
          if (i%2 == 0 && i%3 == 0){
            System.out.println("break at num" + i);
            break;
          }
        }
        
    }
}
