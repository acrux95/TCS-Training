import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("How many terms of Fibonacci series do you want to print?: ");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();

        System.out.println("The terms solicited are:");
        printFibonacciTerms(terms);
    }
    static void printFibonacciTerms(int term) {
        int n1 = 0, n2 = 1, n3 = 0;

        for (int i = 0; i < term; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
