import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please try again.");
        } else {
            if (dividend % divisor == 0) {
                System.out.println(dividend + " is divisible by " + divisor + ".");
            } else {
                System.out.println(dividend + " is not divisible by " + divisor + ".");
            }
        }

        input.close();
    }
}
