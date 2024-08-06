public class PrintNto1 {
    static void printNtoOne(int n){
        if (n==0){
            System.out.println();
            return;
        }
        System.out.println(n);
        printNtoOne(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNtoOne(5);
    }
}
