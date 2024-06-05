public class RotateArray {
    public static void arrayRev(int[] ar,int start, int end){
        while (start<end){
            int temp=ar[end];
            ar[end]=ar[start];
            ar[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] ar={2,1,3,4,2,5};
        int rot=3; // so output should be {3,4,2,5,2,1}
        arrayRev(ar,0,ar.length-1); // rotate whole array
        arrayRev(ar,0,ar.length-rot-1);
        arrayRev(ar,ar.length-rot,ar.length-1);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
