package Lesson4;

import java.util.Scanner;

public class MethodS {
    static Scanner scanner = new Scanner(System.in);

    public static int inputNumber(String att) {

        int num = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + att + " digit try " + (i + 1));

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Error");
                scanner.next();
            }
            if (i == 2) {
                System.exit(0);
            }
        }

        return num;
    }

    public static char inputSymbol() {

        char symbol = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter symbol try " + (i + 1));

            symbol = scanner.nextLine().charAt(0);
            if (symbol == '/' || symbol == '+' || symbol == '-' || symbol == '*' || symbol == '%') {
                return symbol;
            } else {
                System.out.println("ERROR");
                scanner.nextLine();
            }
            if (i == 2) {
                System.exit(0);
            }
        }

        return symbol;
    }

    public static int add(int c1, int c2) {
        return c1 + c2;
    }

    public static int decrease(int c1, int c2) {
        return c1 - c2;
    }

    public static int multiply(int c1, int c2) {
        return c1 * c2;
    }

    public static int division(int c1, int c2) {
        if (c2 == 0) {
            System.out.println("Division by zero is impossible");
            System.exit(0);
        } else {
            return c1 / c2;
        }
        return 0;
    }

    public static int percent(int c1, int c2) {
        return c1 * 100 / c2;
    }
}
