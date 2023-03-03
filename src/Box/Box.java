package Box;
import java.util.Scanner;
public class Box {
    public static void main(String[] args){

        System.out.println("Enter Arithmetic Action (+, -, *, /,): ");
        Scanner input = new Scanner(System.in);
        int firstNum;
        int SecondNum;
        String Action = input.next();
        System.out.println("Addition method will be perform");
        // Addition
        switch (Action) {
            case"+":
            System.out.println("Enter 1stNum");
            //int firstNum;
            firstNum = input.nextInt();
            System.out.println("Enter 2ndNum");
            //int SecondNum;
            SecondNum = input.nextInt();
            System.out.println("Answer is:" + Add(firstNum, SecondNum));
            break;
            // Subtraction
            case "-":
                System.out.println("Enter 1stNum");
               // int firstNum;
                firstNum = input.nextInt();
                System.out.println("Enter 2ndNum");
               // int SecondNum;
                SecondNum =input.nextInt();
                System.out.println("Answer is:" + Sub(firstNum,SecondNum));
              break;
              // Multiplication
            case "*":
                System.out.println("Enter 1stNum");
               // int firstNum;
                firstNum = input.nextInt();
                System.out.println("Enter 2ndNum");
               // int SecondNum;
                SecondNum =input.nextInt();
                System.out.println("Answer is :"+ Mul(firstNum,SecondNum));
                break;
            case "/":
                System.out.println("Enter 1stNum");
              //  int firstNum;
                firstNum=input.nextInt();
                System.out.println("Enter 2ndNum");
               // int SecondNum;
                SecondNum = input.nextInt();
                System.out.println("Answer is :"+ Div(firstNum,SecondNum));
                break;
            default:
                System.out.println("invalid Action");
        }

    }
    public static int Add (int firstNum , int SecondNum ){
        int Add = firstNum + SecondNum;
        return Add;
    }
    public static int Sub ( int firstNum1 , int secondNum2){
        int Sub = firstNum1 - secondNum2;
        return Sub;
    }
    public static int Mul ( int firstNum , int secondNum){
        int Mul = firstNum * secondNum;
        return Mul;
    }
    public static int Div ( int firstNum , int secondNum){
        int Div = firstNum / secondNum;
        return Div;
    }
}
