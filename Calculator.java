import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = inputScanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = inputScanner.nextDouble();

        System.out.println("Choose operation (+, -, *, /):");
        char operator = inputScanner.next().charAt(0);

        double calculationResult = 0;

        switch(operator) {
            case '+': calculationResult = firstNumber + secondNumber; break;
            case '-': calculationResult = firstNumber - secondNumber; break;
            case '*': calculationResult = firstNumber * secondNumber; break;
            case '/':
                if(secondNumber != 0)
                    calculationResult = firstNumber / secondNumber;
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default: System.out.println("Invalid operation");
        }

        System.out.println("Result: " + calculationResult);
    }
}
