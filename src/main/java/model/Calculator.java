package model;

public class Calculator {
    public static String execute(String[] params) {
        String result = null;
        try {
            String operator = params[0];
            String input1 = params[1];
            String input2 = params[2];
            result = "";

            double a = Double.parseDouble(input1);
            double b = Double.parseDouble(input2);

            switch (operator) {
                case ("+"): {
                    result = Double.toString(a + b);
                    break;
                }
                case ("-"): {
                    result = Double.toString(a - b);
                    break;
                }
                case ("*"): {
                    result = Double.toString(a * b);
                    break;
                }
                case ("/"): {
                    if (b==0){throw new CalculatorException("Бросаю исключения калькулятора, деление на 0");}
                    else result = Double.toString(a / b);
                    break;
                }
                default:
                    throw new CalculatorException("Бросаю исключения калькулятора, оператор не поддерживается");
            }
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CalculatorException("Бросаю исключения калькулятора");
        }
        return result;
    }
}
