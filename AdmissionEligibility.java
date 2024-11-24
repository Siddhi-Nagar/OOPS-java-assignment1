import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter marks for Student " + i + ":");

            System.out.print("Enter marks in Mathematics: ");
            int mathMarks = input.nextInt();

            System.out.print("Enter marks in Physics: ");
            int physicsMarks = input.nextInt();

            System.out.print("Enter marks in Chemistry: ");
            int chemistryMarks = input.nextInt();

            int totalMarks = mathMarks + physicsMarks + chemistryMarks;
            int totalMathsPhysics = mathMarks + physicsMarks;

            if ((mathMarks >= 60) && (physicsMarks >= 50) && (chemistryMarks >= 40) && (totalMarks >= 200)
                || (totalMathsPhysics >= 150)) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission.");
            }
        }
        input.close();
    }
}
