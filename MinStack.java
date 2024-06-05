
/**
 * MinStack
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Comparator;

public class MinStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> opsArr = new ArrayList<String>();
        ArrayList<Integer> valArr = new ArrayList<Integer>();

        System.out.print("Enter number of operations you want to carry out: ");
        int opsnum = sc.nextInt();
        sc.nextLine();

        System.out.printf(
                "Enter name of any %d operation(s) u want to carry out from the following in any order:\npush, pop, top, getMin:\n",
                opsnum);
        opsArr.add("MinStack");
        valArr.add(null);

        for (int i = 0; i < opsnum; i++) {
            System.out.printf("Operation %d: ", i + 1);
            String ops = sc.nextLine();
            opsArr.add(ops);

            if (ops.equals("push")) {
                System.out.print("Enter value to push: ");
                int val = sc.nextInt();
                sc.nextLine();
                valArr.add(val);
            } else {
                valArr.add(null);
            }
        }
        System.out.println(opsArr.toString());
        System.out.println(valArr.toString());

        Stack<Integer> myStack = null;

        for (int i = 0; i < opsArr.size(); i++) {
            String operation = opsArr.get(i);
            switch (operation) {
                case "MinStack":
                    myStack = new Stack<Integer>();
                    break;

                case "push":
                    myStack.push(valArr.get(i));
                    break;

                case "pop":
                    System.out.printf("pop: %d\n", myStack.pop());
                    break;

                case "top":
                    System.out.printf("top: %d\n", myStack.peek());
                    break;

                case "getmin":
                    myStack.sort(Comparator.naturalOrder());
                    int min = myStack.get(0);
                    System.out.printf("min: %d\n", min);
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}