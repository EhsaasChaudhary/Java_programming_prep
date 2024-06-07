import java.util.Scanner;


public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = calculateBillAmount(unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);

        scanner.close();
    }

    public static double calculateBillAmount(int unitsConsumed) {
        double billAmount = 0;

        if (unitsConsumed <= 200) {
            billAmount = unitsConsumed * 0.80;
        } else if (unitsConsumed <= 300) {
            billAmount = 200 * 0.80 + (unitsConsumed - 200) * 0.90;
        } else {
            billAmount = 200 * 0.80 + 100 * 0.90 + (unitsConsumed - 300) * 1.00;
        }

        billAmount += 100; 

        if (billAmount > 300) {
            double surcharge = billAmount * 0.1236;
            billAmount += surcharge;
        }

        return billAmount;
    }
}