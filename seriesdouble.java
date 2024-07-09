import java.util.Scanner;

/**
 * seriesdouble
 */
public class seriesdouble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        System.out.print("Enter size of the series: ");
        int size = sc.nextInt();
        sc.nextLine();

        sc.close();
        
        int currnumber = 1;
        while (i < size) {
            if (currnumber % 2 == 1) {
                System.out.println(currnumber + " ");
                currnumber++;
                i++;
            } else {
                for (int j = 0; j < 2; j++) {
                    System.out.println(currnumber + " ");
                }
                currnumber++;
                i = i + 2;
            }
        }

    }
}