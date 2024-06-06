public class EvenlengthWords {
    public static void main(String[] args) {
        String str = "Hello world! i am sooraj how are youu";
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() % 2 == 0) {
                System.out.print(strArray[i] + " ");
            }
        }
    }
}
