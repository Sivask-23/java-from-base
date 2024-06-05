public class RearrangeMaxMin {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7};
        int ans[]=new int[ar.length];
        int start=0;
        int last=ar.length-1;
        boolean flag=true;
        for (int i = 0; i < ar.length; i++) {
            if (flag){
                ans[i]=ar[last--];
            }
            else {
                ans[i]=ar[start++];
            }
            flag=!flag;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
