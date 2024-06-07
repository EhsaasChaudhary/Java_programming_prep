/**
 * threegreatest
 */

import java.util.Scanner;

public class threegreatesttenary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :"); 
        int b = sc.nextInt();
        System.out.print("c :");
        int c = sc.nextInt();
        sc.close();
        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The greatest number is: " + result);
    }
}