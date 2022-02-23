import model.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[] params = new String[3];
        Scanner in = new Scanner(System.in);

        //System.out.println("Ввести оператор (+,-,*,/");

        params[0] = in.nextLine();

        //System.out.println("Ввести первую цифру");

        params[1] = in.nextLine();

        //System.out.println("Ввести вторую цифру");

        params[2] = in.nextLine();

        Calculator.execute(params);

    }

}


