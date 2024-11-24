import java.util.Scanner;

public class LCM {
    public static int findLCM(int a, int b) {
        int hcf = findHCF(a, b);
        return (a * b) / hcf;
    }
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int lcm = findLCM(num1, num2);

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        input.close();
    }
}
