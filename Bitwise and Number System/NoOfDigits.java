public class NoOfDigits {
    public static void main(String[] args) {
        int num=12345;
        int base=10;
        int ans=(int) (Math.log(num)/Math.log(base))+1;
        System.out.println("No of digits in "+num+" is " +ans);


    }
}
