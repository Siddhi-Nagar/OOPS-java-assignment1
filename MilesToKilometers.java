import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double MILES_TO_KM = 1.60934;

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * MILES_TO_KM;

        System.out.println("Distance in kilometers: " + kilometers);

        input.close();
    }
}
