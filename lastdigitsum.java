import java.util.Scanner;

/**
 * lastdigitsum
 */
public class lastdigitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        sc.close();

        int a = num1%10;
        int b = num2%10;
        int ans = a+b;
        System.out.printf("Sum of last digit of %d and %d is %d: ",a, a, ans);
    }
}



