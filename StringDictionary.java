/**
 * String_dictionary
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> wordDict = new ArrayList<String>();
        int flag = 0;

        System.out.print("Enter the string here: ");
        String inputString = sc.nextLine();

        System.out.print("Enter size of Dictionary: ");
        int arrSize = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < arrSize; i++) {
            System.out.printf("Enter element %d in dictionary: ", i + 1);
            String element = sc.nextLine();
            wordDict.add(element);
        }
        sc.close();

        
        for (String word : wordDict) {
            while (inputString.contains(word)) {
                inputString = inputString.replace(word, "");
            }
        }

            if (inputString.isEmpty()) {
                flag++;
            }

        if (flag == 1) {
            System.out.println("True, the string can be separated");
        } else {
            System.out.println("False, the string cannot be separated");
        }
    }
}
