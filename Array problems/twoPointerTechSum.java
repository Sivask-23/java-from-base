public class twoPointerTechSum {
    public static void main(String[] args) {
        int[] ar={10, 20, 35, 50, 75, 80};
        int x=70;
        int l=0;
        int h=ar.length-1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[l]+ar[h]==x){
                System.out.println("Sum found at {"+l+","+h+"}");
                break;
            }else if (ar[l]+ar[h]>x){
                h--;
            }else {
                l++;
            }
        }
    }
}
