import java.util.Scanner;

/**
 * seriesprint
 */
public class seriesprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series length: ");
        int seriesLength = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i < seriesLength; i++) {
            sum = sum+i;
            System.out.println(sum);
        }
    }
}