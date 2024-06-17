import java.util.ArrayList;
import java.util.List;

public class GenerateStringWithones {

    public static List<String> generateBinaryStrings(int k) {
        List<String> result = new ArrayList<>();
        generateStrings(new StringBuilder(), k, result);
        return result;
    }


    private static void generateStrings(StringBuilder current, int k, List<String> result) {
        if (current.length() == k) {
            result.add(current.toString());
            return;
        }

        // Try '0' at current position
        current.append('0');
        generateStrings(current, k, result);
        current.deleteCharAt(current.length() - 1);

        // Try '1' at current position only if last character is not '1'
        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            current.append('1');
            generateStrings(current, k, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        int k = 3;
        System.out.println("Binary strings of length " + k + " without consecutive 1's:");
        List<String> result = generateBinaryStrings(k);
        for (String s : result) {
            System.out.println(s);
        }

        k = 4;
        System.out.println("Binary strings of length " + k + " without consecutive 1's:");
        result = generateBinaryStrings(k);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
