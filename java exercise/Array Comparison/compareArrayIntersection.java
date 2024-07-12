import java.util.Arrays;

public class compareArrayIntersection {
    public static void main(String[] args) {
        int [][]a={{1,2},{5,4},{5,6}};
        int [][]b={{1,2},{5,4},{7,6}};
        int i=0;
        while (i<a.length){
            System.out.println(Arrays.toString(a[i]));
            i++;
        }
    }
}
