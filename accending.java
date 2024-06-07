import java.util.Scanner;



public class accending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.max(num1, num2), num3);
        int mid = num1 + num2 + num3 - min - max;
        System.out.println(min + " " + mid + " " + max);

    }

}

