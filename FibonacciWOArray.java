import java.util.Scanner;

public class FibonacciWOArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        int third;
        for (int i = 0; i < n; i++) {
            System.out.println(first);
            third = first + second;
            first = second;
            second = third;
        }
    }
}
