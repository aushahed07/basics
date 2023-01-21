import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(isPrime(numbers[i]));
        }
    }

    private static String isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
