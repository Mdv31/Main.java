package model;

public class Calculator {
    public static String execute(String params){
        String[] params1 = params.split(" ");
        String input1=params1[0];
        String input2=params1[2];
        String operator=params1[1];

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
