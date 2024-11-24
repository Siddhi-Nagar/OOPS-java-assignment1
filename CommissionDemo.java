import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        if (sales < 0) {
            return -1;
        }
        return sales * 0.10;
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();
        
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commissionObj = new Commission(sales);
            double commission = commissionObj.commission();
            System.out.println("Commission: " + commission);
        }
    }
}