import java.util.ArrayList;
import java.util.Scanner;

/**
 * oddevensum
 */
public class oddevensum {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

       ArrayList<Integer> myArray = new ArrayList<Integer>();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size of Array: ");
       int arrSize = sc.nextInt();
    
       System.out.println("Enter Elements in array");

       for (int i = 0; i < arrSize; i++) {
        System.out.printf("Enter element %d: ",i+1);
        int element = sc.nextInt();
        myArray.add(element);
       }
       sc.close();

       System.out.println(myArray.toString());
        
        for (int i = 0; i < myArray.size(); i++) {
            if (myArray.get(i) % 2 == 0) {
                evenSum += myArray.get(i);
            } else {
                oddSum += myArray.get(i);
            }
        }
        System.out.println("Sum of Odd Numbers: " + oddSum);
        System.out.println("Sum of Even Numbers: " + evenSum);
    }
}