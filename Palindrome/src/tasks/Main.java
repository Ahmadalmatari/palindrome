package tasks;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 150; i++) {

            if (palindrome(i)) {

                System.out.println("the " + i + " : is palindrome");

            } else
                System.out.println("the " + i + " : is not palindrome");

        }

    }


    public static boolean palindrome(int num) {

        StringBuilder reverse = new StringBuilder();

        if (num <= 9) {
            return true;
        }  else if (num > 10) {
            String original = String.valueOf(num);
            for (int length = original.length() - 1; length >= 0; length--) {
                reverse.append(original.charAt(length));
            }
            return original.equals(reverse.toString());
        }
        return false;
    }
}
