import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}