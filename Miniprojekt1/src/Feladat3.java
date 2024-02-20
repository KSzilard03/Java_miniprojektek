import java.util.Scanner;

public class Feladat3 {

    public static int Calculator(int number1, int number2, int operator) {

        int result = 0;

        switch (operator) {

            case 1:

                result = number1 + number2;
                break;

            case 2:

                result = number1 - number2;
                break;

            case 3:

                result = number1 * number2;
                break;

            case 4:

                result = number1 % number2;
                break;

            default:

                System.out.println("Nem felismerhető operátor!");

        }

        return result;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 to exit");

        int operator = input.nextInt();

        if (operator == 5) {

            System.out.println("You stopped the calculator!");

        }

        while (operator != 5) {

            int result = Calculator(firstNumber, secondNumber, operator);

            System.out.println("Result:" + result);

            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to exit");

            operator = input.nextInt();

            if (operator == 5) {

                System.out.println("You stopped the calculator!");

            }

        }

        input.close();

    }
}
