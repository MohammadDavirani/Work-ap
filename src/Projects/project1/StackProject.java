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
        int strLength = str.length();
        char character;
        for(int i=0;i<strLength;i++) {
            character = str.charAt(i);
            stack.push(character);
        }
    }
}
