import java.util.Scanner;

public class binaryDecimal {
    public static int binary_to_decimal(String binary) {
        int decimal = 0, base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static String decimal_to_binary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        return binary.equals("") ? "0" : binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter binary number: ");
            String binary = sc.next();
            System.out.println("Decimal: " + binary_to_decimal(binary));
        } else if (choice == 2) {
            System.out.print("Enter decimal number: ");
            int decimal = sc.nextInt();
            System.out.println("Binary: " + decimal_to_binary(decimal));
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
