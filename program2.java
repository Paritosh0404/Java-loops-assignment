import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
       
        try(Scanner scan = new Scanner(System.in)) {
        int n = scan.nextInt();
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
       }
    }
  }
 }