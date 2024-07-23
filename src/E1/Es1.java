package E1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un testo");
        String txt = scanner.nextLine();
        System.out.println(evenOdd(txt));

        scanner.close();
    }

    public static boolean evenOdd(String txt) {;
        return txt.length() % 2 == 0 ? true : false;
    }
    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

}
