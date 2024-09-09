// 1            sum=1
// 1 1          sum=2
// 1 2 1        sum=4
// 1 3 3 1      sum=8
// 1 4 6 4 1    sum=16
// 1 5 10 10 5 1
public class NthSumOfPascalTri {
    public static void main(String[] args) {
        int nthRow = 4;
        int sum= (1<<(nthRow-1));
        System.out.println(sum);

    }
}
