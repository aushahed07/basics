import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fibonacciNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            if (i <= 1 ) {
                fibonacciNumbers[i] = i;
            } else {
                fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(fibonacciNumbers[i]);
        }
    }
}
