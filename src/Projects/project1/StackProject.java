package src.Projects.project1;

import java.util.Scanner;
import java.util.Stack;

public class StackProject {
    public static void main(String[] args) {

        System.out.println("=== Stack ===");


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = input.nextLine();

        Stack<Character> stack = new Stack<>();
        char temp;
        boolean balance = true;

        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (temp == '(') {
                stack.push(temp);
            } else if (temp == ')') {
                if (stack.isEmpty()) {
                    balance = false;
                    break;
                }
                stack.pop();
            }
        }

        if (balance && stack.isEmpty()) {
            System.out.println("The required number of parentheses has been inserted.");
        }
        else {
            System.out.println("The required number of parentheses is <<NOT>> included.");
        }
    }
}