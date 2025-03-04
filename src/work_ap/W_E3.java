package work_ap;
import java.util.Scanner;


public class W_E3 {
    public static void main(String[] args) {
        System.out.println("=== inverse program ===");
        System.out.print("please enter a number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reminder,external;
        while(num>0)
        {
            reminder = num %10 ;
            System.out.format("%d ",reminder);
            external = num/10;
            num = external;
        }
    }
}
