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

            if (-2147483647 >= a || b >= 2147483647) {
                throw new CalculatorException("Бросаю исключения калькулятора, число за границей long int");
            }
            double r1=a+b;
            double r2=a*b;
            if (r1 > 2147483647) {
                throw new CalculatorException("Бросаю исключения калькулятора, число за границей long int");
            }
            if (r2 > 2147483647) {
                throw new CalculatorException("Бросаю исключения калькулятора, число за границей long int");
            }
            if (r1 < -2147483647) {
                throw new CalculatorException("Бросаю исключения калькулятора, число за границей long int");
            }
            if (r2 < -2147483647) {
                throw new CalculatorException("Бросаю исключения калькулятора, число за границей long int");
            }

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
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CalculatorException("Бросаю исключения калькулятора");
        }
        return result;
    }
}
