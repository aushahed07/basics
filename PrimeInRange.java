import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        for (int number = low; number <= high; number++) {
            int count = 0;
            for (int i = 2; i * i <= number; i++) {
                if(number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number);
            }
        }
    }
}
