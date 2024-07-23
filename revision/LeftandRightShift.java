public class LeftandRightShift {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        int numOfshifts = 1;
        int leftS = a << numOfshifts;  // 5=0101 after left shift by 1 shift => 0101 => 1010 which is 10 in decimal
        System.out.println("After leftshift "+a+" becomes "+leftS);
    }
}
