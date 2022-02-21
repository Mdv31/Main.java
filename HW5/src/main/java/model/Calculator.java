package model;

public class Calculator {
    public static String execute(String operator, String input1, String input2){
        String result = "";
        try {
            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);

            switch (operator) {
                case ("+"): {
                    result = Integer.toString(a + b);
                    break;
                }
                case ("-"): {
                    result = Integer.toString(a - b);
                    break;
                }
                case ("*"): {
                    result = Integer.toString(a * b);
                    break;
                }
                case ("/"): {
                    result = Integer.toString(a / b);
                    break;
                }
                default:
                    System.out.println("Оператор " + operator + " не поддерживается");
            }
            System.out.println("Результат: " + result);

        }catch (CalculatorException e){
            e.printStackTrace();
            }
        return result;}
}
