package work_ap;

import java.util.Scanner;

public class W_E2 {
    public static void main(String[] args) {
        System.out.println("=== Summation ===");
        System.out.print("please enter a number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.format("summation is : %d",sum);

    }
}
