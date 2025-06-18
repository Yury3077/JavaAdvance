package IBSJavaAdvance.CalculatorOop;

public class Calculator {
    public Double doOperation(Double number1, Double number2, String operation) {
        Double res = 0.0;
        switch (operation) {
            case "+":
                Sum sum = new Sum();
                res = sum.doOperation(number1, number2);
                break;
            case "-":
                Subtraction subtraction = new Subtraction();
                res = subtraction.doOperation(number1, number2);
                break;
            case "*":
                Multiplication multiplication = new Multiplication();
                res = multiplication.doOperation(number1, number2);
                break;
            case "/":
                Division division = new Division();
                res = division.doOperation(number1, number2);
                break;
            default:
                System.out.println("Действие на найдено в калькуляторе");
        }

        return res;
    }
}
