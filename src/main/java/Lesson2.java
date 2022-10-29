import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        int c1 = 0, c2 = 0;
        //double result = 0;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1-st digit");
        if (scanner.hasNextInt()) {
            c1 = scanner.nextInt();
        } else {
            System.out.println("Error not digit");
            System.exit(0);
        }
        System.out.println("Enter math operator");
        symbol = scanner.next().charAt(0);
        System.out.println("Enter 2-nd digit");
        if (scanner.hasNextInt()) {
            c2 = scanner.nextInt();
        } else {
            System.out.println("Error not digit");
            System.exit(0);
        }

        int result = 0;
        boolean s = false;

        if (symbol == '+') {
            result = c1 + c2;
            s = true;
        }

        if (symbol == '-') {
            result = c1 - c2;
            s = true;
        }

        if (symbol == '*') {
            result = c1 * c2;
            s = true;
        }

        if (symbol == '/') {
            if (c2==0){
                System.out.println("Division by zero is impossible");
                System.exit(0);
            } else {
                result = c1 / c2;
            }
            s = true;
        }

        if (symbol == '%') {
            result = c1 * 100 / c2;
            s = true;
        }

        if (!s) {
            System.out.println("ERROR symbol");
            System.exit(0);

        }

            System.out.println("RESULT = " + result);
    }
}






