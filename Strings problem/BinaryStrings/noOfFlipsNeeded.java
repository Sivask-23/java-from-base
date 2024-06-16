public class noOfFlipsNeeded {
    public static void method1(String str) {
        char[] ar0 = new char[str.length()];
        char[] ar1 = new char[str.length()];
        int c0 = 0, c1 = 0;
        for (int i = 0; i < ar0.length; i++) {
            if (i % 2 == 0) {
                ar0[i] += '0';
            } else {
                ar0[i] += '1';
            }
        }

        for (int i = 0; i < ar0.length; i++) {
            if (i % 2 == 0) {
                ar1[i] += '1';
            } else {
                ar1[i] += '0';
            }
        }

        for (int i = 0; i < ar0.length; i++) {
            System.out.print(ar0[i]);
        }
        System.out.println();
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i]);
        }

        for (int i = 0; i < ar0.length; i++) {
            if (ar0[i] != str.charAt(i)) {
                c0++;
            }
        }

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != str.charAt(i)) {
                c1++;
            }
        }
        System.out.println();
        System.out.println("Min no of flip needed is " + Math.min(c0, c1));
    }


//    efficient method

    public static int efficientMethod(String str, String pattern) {
        int flips = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != pattern.charAt(i)) {
                flips++;
            }
        }

        return flips;

    }

    public static void efficientMethod2(String str) {
        int c0 = 0, c1 = 0;
        char ptrn0;
        char ptrn1;
        for (int i = 0; i < str.length(); i++) {
            ptrn0 = (i % 2 == 0) ? '0' : '1';
            ptrn1 = (i % 2 == 0) ? '1' : '0';

            if (str.charAt(i) != ptrn0) {
                c0++;
            }
            if (str.charAt(i) != ptrn1) {
                c1++;
            }
        }

        System.out.println("Min flips needed using efficient method2 is " + Math.min(c0, c1));


    }


    public static void main(String[] args) {
        String str = "010101101011";
        method1(str); // inefficient way bcz we use two extra arrays
        int c0 = efficientMethod(str, "010101010101");
        int c1 = efficientMethod(str, "101010101010");
        System.out.println("Min flip needed using efficient method is " + Math.min(c0, c1));
        efficientMethod2(str);


    }
}
