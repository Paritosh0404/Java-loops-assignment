import java.util.Scanner;

public class program3 {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int gcd = findGcd(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 }

