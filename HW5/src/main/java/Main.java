import model.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ввод оператора +,-,*,/");
        Scanner op = new Scanner(System.in);
        String line_op = op.nextLine();
        System.out.println("Ввод числа1");
        Scanner in1 = new Scanner(System.in);
        String line_in1 = in1.nextLine();
        System.out.println("Ввод числа2");
        Scanner in2 = new Scanner(System.in);
        String line_in2 = in2.nextLine();

        Calculator.execute(line_op,line_in1,line_in2);
    }

}


