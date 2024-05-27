import java.util.Scanner;

public class searchElemnt {
    public static boolean searchArray(int[] arr, int ele) {
//        boolean test = false;
        for (int j : arr) {
            if (j == ele) {
//                test = true;
                return true;
//                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int flag = 0;
        System.out.println("Enter elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int ele = sc.nextInt();
//        searchArray(a,ele);
        if (searchArray(a,ele)){
            System.out.println("Element found");
        }
        else {
            System.out.println("not found");
        }
//        for (int i : a) {
//            if (i == ele) {
//                flag = 1;
//                System.out.println("Element found at" + i);
//                break;
//            }
//        }
//        if (flag == 0) {
//            System.out.println("Element not found ");
//        }
    }
}
