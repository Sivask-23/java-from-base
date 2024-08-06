public class FindNthtermoffibSeries {
    static int findFib(int n){

        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int nthterm=findFib(n-1) +findFib(n-2);
        return nthterm;
    }
    public static void main(String[] args) {
        System.out.println(findFib(7));
    }
}
