package IBSJavaAdvance.CalculatorOop;

public class Division implements Operations {
    @Override
    public Double doOperation(Double number1, Double number2) {
        try {
            int res = number1.intValue() / number2.intValue();
            return number1 / number2;
        }
        catch (ArithmeticException e) {
            e.getStackTrace();
            System.out.println("Деление на 0!");
            return null;

        }
    }
}
