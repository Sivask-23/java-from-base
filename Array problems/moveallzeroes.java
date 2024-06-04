public class moveallzeroes {
    public static void main(String[] args) {
        int ar[] = {1, 2, 0, 0, 3, 0, 4, 5, 0};
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                ar[count++] = ar[i];
            }
        }
        while (count<ar.length){ // adding zeroes to the end of array
            ar[count++]=0;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
