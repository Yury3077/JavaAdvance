package IBSJavaAdvance.CalculatorOop;

public class Calculator {
    private Double number1;
    private Double number2;
    private String operation;
    private Double result;

    public Calculator(Double number1, Double number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getResult() {
        switch (operation) {
            case "+":
                Sum sum = new Sum();
                result = sum.doOperation(number1, number2);
                break;
            case "-":
                Subtraction subtraction = new Subtraction();
                result = subtraction.doOperation(number1, number2);
                break;
            case "*":
                Multiplication multiplication = new Multiplication();
                result = multiplication.doOperation(number1, number2);
                break;
            case "/":
                Division division = new Division();
                result = division.doOperation(number1, number2);
                break;
        }

        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
