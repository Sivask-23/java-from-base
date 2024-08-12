public class Triangle1 {
    static void printT1(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("* ");
            printT1(r,c+1);
        }else {
            System.out.println();
            printT1(r-1,0);
        }
    }

//     triangle 2
    static void printT2(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            printT2(r,c+1);
            System.out.print("* ");
        }else {
            printT2(r-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printT1(5,0);
        printT2(5,0);
    }
}
