package ie.atu;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        subtract();
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
}
