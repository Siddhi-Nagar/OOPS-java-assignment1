import java.util.Scanner;
import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        double median;
        if (n % 2 == 0) {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            median = numbers[n / 2];
        }

        System.out.println("The median is: " + median);

        sc.close();
    }
}
