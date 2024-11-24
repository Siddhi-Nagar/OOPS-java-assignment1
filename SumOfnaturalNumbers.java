import java.util.Scanner;

public class SumOfnaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the range (n): ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);

        input.close();
    }
}
