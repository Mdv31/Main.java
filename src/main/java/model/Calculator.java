package model;

public class Calculator {
    public static String execute(String[] params){
        String input1=params[0];
        String input2=params[1];
        String operator=params[2];

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
