import model.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ввод выражение (например 2 + 2)");
        Scanner line = new Scanner(System.in);
        String params = line.nextLine();


        Calculator.execute(params);
    }

}


