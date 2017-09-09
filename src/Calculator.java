import java.util.Scanner;

/**
 * Created by thomas on 9/8/17.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1, num2, operation;

        System.out.print("Enter a number: ");
        num1 = scanner.nextLine();

        System.out.print("Enter another number: ");
        num2 = scanner.nextLine();

        System.out.print("Enter an operation: ");
        operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
                return;
            case "-":
                System.out.println(Integer.parseInt(num1) - Integer.parseInt(num2));
                return;
            case "*":
                System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
                return;
            case "/":
                System.out.println(Integer.parseInt(num1) / Integer.parseInt(num2));
                return;
        }
    }
}
