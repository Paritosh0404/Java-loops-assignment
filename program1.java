import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
        System.out.print("Enter a positive integer: ");
        int n = scan.nextInt();
        
        if (n <= 0) {
            System.out.println("Enter a positive integer");
            return;
        }
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("The sum of "+ n +" natural numbers is: " + sum);
    }
 }
}
