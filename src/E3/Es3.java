package E3;

import java.util.Arrays;
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a text");
            String text = scan.nextLine();
            if (text.equals(":q")) break;
            String[] txt = text.split("");
            System.out.println(String.join(",", txt));
        };
        scan.close();
    }
}
