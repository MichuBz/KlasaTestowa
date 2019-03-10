import jdk.swing.interop.SwingInterOpUtils;

public class BruteForce {


    private final static String SECRET = "cbac";
    private final static char[] DICTIONARY = new char[]{'a', 'b', 'c'};
    private static boolean found = false;

    private static boolean checkPassword(String input) {
        System.out.println(input);
        return input.equals(SECRET);
    }

    private static void bruteforce(String input, final int n) {
        if (n != 0) {
            if (checkPassword(input)) {
                found = true;
                System.out.println("znalazlem" + input);
            }


        } else {
            for (char character : DICTIONARY) {
                if (!found) {
                    String newInput = input + character;
                    bruteforce(newInput, n - 1);
                }
            }
        }
    }

    public static void main(String[] args) {

        bruteforce("", 4);
    }
}
