import model.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        /*System.out.println("Ввод выражение (например 2 + 2)");
        Scanner line = new Scanner(System.in);
        String[] params = new String[0];
        params[0]= line.nextLine();*/

        String[] params = new String[3];
        System.out.println("Ввести первую цифру");
        Scanner in = new Scanner(System.in);
        params[0] = in.nextLine();
        System.out.println("Ввести вторую цифру");
        Scanner in1 = new Scanner(System.in);
        params[1] = in1.nextLine();
        System.out.println("Ввести оператор (+,-,*,/");
        Scanner in2 = new Scanner(System.in);
        params[2] = in2.nextLine();

        Calculator.execute(params);
    }

}


