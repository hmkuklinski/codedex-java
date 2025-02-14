public class ReturnBins{

    // Create returnBin() method here 💖
    public static void returnBin(String[] myarr){
        System.out.println("Items To Return\n-------------\n");
        for(int i=0;i<myarr.length;i++){
            System.out.println((i+1) + ". " + myarr[i]);
        }
    }

    public static void main(String[] args) {
        String[] myitems = {"Apple Watch", "Size 9 Shoes", "Wallet", "Suitcase", "Laptop"};
        returnBin(myitems);
    }
}