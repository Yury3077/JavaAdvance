package IBSJavaAdvance.CalculatorOop;

import java.util.Scanner;

public class CreateCalculator {
    private Double number1;
    private Double number2;
    private String sign;
    private Double result;

    public CreateCalculator() {
        setNumber1();
        setNumber2();
        setSign();
        Calculator calculator = new Calculator(this.number1, this.number2, this.sign);
        this.result = calculator.getResult();
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введи число 1: ");
        this.number1 = console.nextDouble();
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введи число 2: ");
        this.number2 = console.nextDouble();
    }

    public String getSign() {
        return sign;
    }

    public void setSign() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введи знак:");
        this.sign = console.next();
        console.close();
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return this.number1.toString() + this.sign + this.number2.toString() + "=" + this.result;
    }
}
