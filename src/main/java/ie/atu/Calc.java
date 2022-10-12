package ie.atu;
import java.util.Scanner;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        subtract();
        add();
        multiple();
    }
    public static void subtract(){
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int num1 = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int num2 = inputs.nextInt();
        
        int total = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + total);
    }

    public static void add()
    {
        System.out.println("Please enter your first number:");
        Scanner inputs =  new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);

    }
    public static void multiple()
    {
        System.out.println("Please enter your first number:");
        Scanner inputs =  new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNum = inputs.nextInt();

        int total = firstNum * secondNum;
        System.out.println(firstNum +  "*" + secondNum  + "=" + total);
    }
}
