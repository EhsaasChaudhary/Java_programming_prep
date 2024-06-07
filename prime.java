/**
 * prime
 */

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =  sc.nextInt();
        sc.close();
        boolean flag = true;

        for (int i = 1; i <= number/2; i++) {
            if (number % 2 == 0) {
                flag = false;
            }
        }

        if (flag) {
            System.out.printf("%d is prime",number);
        }else{
            System.out.printf("%d is not prime",number);
        }

    }
}