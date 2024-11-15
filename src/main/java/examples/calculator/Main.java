package examples.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("[Input1]:");
        int i1 = sc.nextInt();
        System.out.print("[Input2]:");
        int i2 = sc.nextInt();
        System.out.print("[Operator]:");
        String op = sc.next();

        Calc calc = new Calc();
        switch (op) {
            case "+":
                System.out.println(calc.add(i1, i2));
                break;
            case "-":
                System.out.println(calc.sub(i1, i2));
                break;
            case "*":
                System.out.println(calc.mul(i1, i2));
                break;
            case "/":
                System.out.println(calc.div(i1, i2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
