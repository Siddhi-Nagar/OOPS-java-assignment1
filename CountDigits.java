import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;  
            count++;      
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + count);
        input.close();
    }
}
