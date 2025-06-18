package IBSJavaAdvance.CalculatorOop;

public class Division implements Operations {
    @Override
    public Double doOperation(Double number1, Double number2) {
        if (number2.intValue() == 0) {
            System.out.println("Деление на 0!");
            return null;
        } else {
            return number1 / number2;
        }
    }
}
