import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower bound of the interval: ");
        int lower = input.nextInt();

        System.out.print("Enter the upper bound of the interval: ");
        int upper = input.nextInt();

        System.out.println("Multiples of 10 between " + lower + " and " + upper + ":");

        int start = lower;
        if (start % 10 != 0) {
            start = lower + (10 - lower % 10); 
        }
        for (int i = start; i <= upper; i += 10) {
            System.out.print(i + " ");
        }

        input.close();
    }
}

