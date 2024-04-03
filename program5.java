 import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scan.nextInt();

        System.out.println("Fibonacci series with " + n + " terms:");
        FibonacciSeries(n);

    }
}

    public static void FibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}