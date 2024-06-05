/**
 * Needle_In_Haystack
 */

import java.util.Scanner;

public class Needle_In_Haystack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Haystack String here: ");
        String Haystack = sc.nextLine();

        System.out.print("Enter Needle String here: ");
        String Needle = sc.nextLine();
        
        sc.close();

        System.out.println("-----*-----*-----*-----*-----");
        
        System.out.printf("Haystack string is: %s\n",Haystack);
        System.out.printf("Needle string is: %s\n",Needle);
        System.out.printf("Does Haystack contain Needle: %b\n", Haystack.contains(Needle));
        System.out.printf("Size of Needle in Haystack: %d\n", Haystack.length()-Haystack.compareTo(Needle));
        System.out.printf("Index of Needle in Haystack: %d\n", Haystack.indexOf(Needle));
    }
}