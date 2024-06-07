/**
 * palindrom
 */

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        sc.close();
        int reverse = 0;
        
        int a = number;
        
        while(number > 0){
            reverse = (reverse * 10) + number%10;
            number = number/10;
        }
        
        if (a == reverse) {
            System.out.println("Number is Palindrom");
        }else{
            System.out.println("Number is not palindrom");
        }
    }
}