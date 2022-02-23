package model;

public class Calculator {
    public static String execute(String[] params) {
        String result = null;
        try {
            String operator = params[0];
            String input1 = params[1];
            String input2 = params[2];
            result = "";

            float a = Float.parseFloat(input1);
            float b = Float.parseFloat(input2);

            switch (operator) {
                case ("+"): {
                    result = Float.toString(a + b);
                    break;
                }
                case ("-"): {
                    result = Float.toString(a - b);
                    break;
                }
                case ("*"): {
                    result = Float.toString(a * b);
                    break;
                }
                case ("/"): {
                    result = Float.toString(a / b);
                    break;
                }
                default:
                    System.out.println("Оператор " + operator + " не поддерживается");
            }
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CalculatorException("Бросаю исключения калькулятора");
        }
        return result;
    }
}
