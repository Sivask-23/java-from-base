public class rotateStringLeftRight {

// Reverse a string
    public static char[] revUsingTwoPointer(char [] ar,int lb, int ub) {

        int fIndex = lb;
        int lindex = ub;
        while (fIndex < lindex) {
            char temp = ar[fIndex];
            ar[fIndex] = ar[lindex];
            ar[lindex] = temp;
            fIndex++;
            lindex--;
        }
        return ar;
    }

    public static void leftRot(char[] str, int rot){

        for (int i = 0; i < rot; i++) {
            char t=str[0];
            for (int j = 0; j < str.length-1; j++) { //n*n*n n^3
                str[j]=str[j+1];
            }
            str[str.length-1]=t;
        }

        System.out.println(str);

    }

    public static void rightRot(char [] str, int rot){

        int r= rot% str.length; // it ensure this rot will not go out of bound

        revUsingTwoPointer(str,0, str.length-1);  //  ABCDEF -> FBAEDC
        revUsingTwoPointer(str,r, str.length-1);  // FEDCBA ->   FEABCD
        System.out.println(revUsingTwoPointer(str,0, r-1));  // FEABCD -> EFABCD

    }

    public static void main(String[] args) {
        String str="ABCDEF";
        int rot=2;
        char []ar=str.toCharArray();
        leftRot(ar,rot);
        rightRot(ar,rot);

    }
}
