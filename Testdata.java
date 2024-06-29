import java.util.Scanner;

/**
 * TestData
 */

 public class Testdata {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of Data objects
        System.out.print("Enter the number of users: ");
        int numberOfUsers = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array to store multiple Data objects
        Data[] dataArray = new Data[numberOfUsers];

        // Populate the array with Data objects using user input
        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Enter details for user " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            dataArray[i] = new Data(name, age);
        }

        // Close the scanner
        scanner.close();

        // Iterate through the array and display the data
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(
                "Name: " + dataArray[i].getName() + "\n" +
                "Age: " + dataArray[i].getAge()
            );
        }
    }
}
