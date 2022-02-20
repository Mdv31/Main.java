package model;

public class Calculator {
    public static String execute(String operator, String input1, String input2){
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);
        String result = "";
        switch (operator){
            case ("+"):{result= Integer.toString(a+b) ; break;}
            case ("-"):{result= Integer.toString(a-b) ; break;}
            case ("*"):{result= Integer.toString(a*b) ; break;}
            case ("/"):{result= Integer.toString(a/b) ; break;}
            default: System.out.println("Оператор "+operator+" не поддерживается");}
        System.out.println("Результат: "+result);
        return result;
    }
}
