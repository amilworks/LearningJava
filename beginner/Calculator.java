/**
 * For those of you who are not well-endowed mathematically, here is your answer.
 * Accounting people may use this calculator as well.
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner blueberry = new Scanner(System.in);
        double number1, number2, answer=0;
        char math_operator;
        System.out.println("Enter a number you LIKE: ");
        number1 = blueberry.nextDouble();
        System.out.println("Enter a number you HATE: ");
        number2 = blueberry.nextDouble();
        System.out.println("Enter what operation you want: ");
        math_operator = blueberry.next().charAt(0);

        switch(math_operator) {
            case '+': answer = number1 + number2;
                break;
            case '-': answer = number1 - number2;
                break;
            case '*': answer = number1 * number2;
                break;
            case '/': answer = number1/number2;
                break;
            case '^': answer = number1*number2*number1*number2;
                System.out.println("Surprise (Explicit). I squared BOTH numbers!");
                break;
        }
        System.out.println(number1+" "+math_operator+" "+number2+" = "+ answer);
    }
}
