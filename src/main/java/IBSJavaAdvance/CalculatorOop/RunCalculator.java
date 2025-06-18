package IBSJavaAdvance.CalculatorOop;

public class RunCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result: " + calculator.doOperation(5.0, 6.1, "+"));
        System.out.println("Result: " + calculator.doOperation(4.0, 7.1, "-"));
        System.out.println("Result: " + calculator.doOperation(2.0, 4.1, "*"));
        System.out.println("Result: " + calculator.doOperation(28.0, 4.0, "/"));
        System.out.println("Result: " + calculator.doOperation(28.0, 0.0, "/"));
        System.out.println("Result: " + calculator.doOperation(28.0, 0.0, "90"));
    }
}
