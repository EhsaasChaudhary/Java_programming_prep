import java.util.Scanner;



public class bitwiseoddeven {

    public static boolean isEven(int n){
        return (n&1) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        sc.close();
        if(isEven(a)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}

