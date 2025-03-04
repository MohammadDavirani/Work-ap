package work_ap;
import java.util.Scanner;

public class W_E4 {
    public static void main(String[] args)
    {
        System.out.println("=== Odd / Even number ===");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = input.nextInt();

        oddOrEvenNumber(number);
        input.close();
    }


    public static void oddOrEvenNumber(int number) {
        if(number %2 ==0) {
            System.out.print("number is even");
        }
        else {
            System.out.print("number is odd");
        }
    }
}
