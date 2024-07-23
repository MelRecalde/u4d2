package E4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        // System.out.println(number);

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        scan.close();
    }
}
