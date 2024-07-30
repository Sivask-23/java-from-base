public class swapTwoNumbers {
    static void swapNum(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }

    static void changeName(String a){
        String temp=a+"Kumar";
        System.out.println(temp);
    }
    public static void main(String[] args) {

        int a=5;
        int b=10;
        String str1="Siva";
        swapNum(a,b);
        System.out.println(a+" "+b);
        System.out.println();
        changeName(str1);
        System.out.println(str1);

    }
}
