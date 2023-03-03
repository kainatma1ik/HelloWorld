package cat;

import java.util.Scanner;

public class cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of operation you want to perform (+, -, *, /,): ");
        String operation = sc.next();

        if (operation.equals("+")) {
            System.out.println("Enter firstNumber");
            int firstNumber = sc.nextInt();
            System.out.println("Enter secondNumber");
            int secondNumber = sc.nextInt();
            int Answer = firstNumber + secondNumber;
            System.out.println(" firstNumber + "+" secondNumber"+ "=" + Answer);

        }
       else if ( operation.equals("-")){
           System.out.println("Enter first Number");
           int firstNumber = sc.nextInt();
           System.out.println("Enter second Number");
           int secondNumber = sc.nextInt();
           int Answer = firstNumber- secondNumber;
           System.out.println("firstNumber - "+" secondNumber"+"=" + Answer);
       }
       else if (operation.equals("*")){
            System.out.println("Enter first Number");
            int firstNumber = sc.nextInt();
            System.out.println("Enter SecondNumber");
            int secondNumber= sc.nextInt();
            int Answer = firstNumber * secondNumber;
            System.out.println("FirstNumber * "+" SecondNumber"+"=" + Answer);
        }
       else if (operation.equals("/")) {
            System.out.println("Enter FirstNumber");
            int firstNumber = sc.nextInt();
            System.out.println("Enter SecondNumber");
            int secondNumber = sc.nextInt();
            int Answer = firstNumber/ secondNumber;
            System.out.println("FirstNumber / SecondNumber"+"="+ Answer);

        }
    }

    public static int performOperation(int firstNumber, int secondNumber, String operation) {
        int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Invalid operation");
        }
        return result;
    }
}
