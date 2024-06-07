import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * nonDublicateArr
 */
public class nonDublicateArr {
    public static void main(String[] args) {
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

       myArray.sort(Comparator.naturalOrder());
       

       for (int i = 0; i < myArray.size()-1; i++) {
        
        if (myArray.get(i) == myArray.get(i+1)) {
            myArray.remove(i);
        }
       }
       System.out.println(myArray.toString());
    }
}