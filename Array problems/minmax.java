public class minmax {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 2, 8, 89, 2, 5};
        int min, max;
        min = arr[0];
        max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("maximum value in te array is: " + max);
    }
}
