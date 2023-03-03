package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            System.out.println("Which arithmetic operation would you like to perform?\nTo Add enter (A)\nTo Divide enter (D)\nTo Subtract enter (S)\nTo Multiply enter (M)");
            Scanner input = new Scanner(System.in);
            String methodAbbr = input.next();
            System.out.println("You have entered :" + methodAbbr);
            // Addition

            if (methodAbbr.equalsIgnoreCase("a")) {
                System.out.println("We are performing addition");

                System.out.println("Please Enter 1st Num");
                Scanner firstNumInput = new Scanner(System.in);
                int firstNum = firstNumInput.nextInt();

                System.out.println(" Please Enter 2nd Num");
                Scanner secondNumInput = new Scanner(System.in);
                int SecondNum = secondNumInput.nextInt();

                System.out.println("Answer is:" + add(firstNum, SecondNum));

                // Subtraction
            } else if (methodAbbr.equalsIgnoreCase("s")) {
                System.out.println("We are performing subtraction");

                System.out.println("Please Enter 1st Num");
                Scanner firstNumInput = new Scanner(System.in);
                int firstNum = firstNumInput.nextInt();

                System.out.println(" Please Enter 2nd Num");
                Scanner secondNumInput = new Scanner(System.in);
                int SecondNum = secondNumInput.nextInt();

                System.out.println("Answer is:" + sub(firstNum, SecondNum));
                // Multiplication
            } else if (methodAbbr.equalsIgnoreCase("m")) {
                System.out.println("We are performing multiplication");

                System.out.println("Please Enter 1st Num");
                Scanner firstNumInput = new Scanner(System.in);
                int firstNum = firstNumInput.nextInt();

                System.out.println(" Please Enter 2nd Num");
                Scanner secondNumInput = new Scanner(System.in);
                int SecondNum = secondNumInput.nextInt();

                System.out.println("Answer is:" + mul(firstNum, SecondNum));
                // Division
            } else if (methodAbbr.equalsIgnoreCase("d")) {
                System.out.println("We are performing division");
                System.out.println("please Enter 1st Num");
                Scanner firstNumInput = new Scanner(System.in);
                int firstNum = firstNumInput.nextInt();

                System.out.println(" Please Enter 2nd Num");
                Scanner secondNumInput = new Scanner(System.in);
                int SecondNum = secondNumInput.nextInt();
                System.out.println("Answer is:" + div(firstNum, SecondNum));
            } else {
            }
        }catch (Exception e) {
            System.out.println("You have not entered a value input");
        }
    }

    private static int add(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return sum;
    }

    public static int sub(int firstNum, int secondNum) {
        int sub = firstNum - secondNum;
        return sub;

    }

    public static int div(int firstNum, int secondNum) {
        int div = firstNum % secondNum;
        return div;
    }

    public static int mul(int firstNum, int SecondNum) {
        int mul = firstNum * SecondNum;
        return mul;
    }

    private static int sumAndSubThenDivide(int firstNum, int secondNum) {
        int sumNumber = add(firstNum, secondNum);
        int subNum = sub(firstNum, secondNum);
        int divide = div(sumNumber, subNum);
//        int divide= div(sum(firstNum,secondNum),sub(firstNum,secondNum));
        return divide;
    }
}

