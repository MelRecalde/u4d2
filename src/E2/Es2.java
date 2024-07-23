package E2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println(stringNum(num));
    }

    public static String stringNum(int number) {
        String answer;
        switch (number) {
            case 0: {
                answer = "ZERO";
                break;
            }
            case 1: {
                answer = "ONE";
                break;
            }
            case 2: {
                answer = "TWO";
                break;
            }
            case 3: {
                answer = "THREE";
                break;
            }
            default:
                answer = "Impossible to convert, number not between 0 and 3 ";
        }
        return answer;
    }
}
