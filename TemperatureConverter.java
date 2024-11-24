import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to convert Celsius to Fahrenheit.");
        System.out.println("Enter 2 to convert Fahrenheit to Celsius.");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Celsius:");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}
