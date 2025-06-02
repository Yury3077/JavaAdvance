package IBSJavaAdvance;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author - Balykov Yury
 * @See - A Simple calculator
 */
public class Calculator {
    /**
     * Start point, get values from user, call calculate method
     */
    public static Double calculateMe() {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи число 1: ");
        Double num1 = console.nextDouble();

        System.out.print("Введи число 2: ");
        Double num2 = console.nextDouble();

        System.out.print("Введи знак:");
        String sign = console.next();

        console.close();

        return workCalc(num1, num2, sign);
    }

    /**
     * @param num1 - number with floating point, taken from terminal
     * @param num2 - number with floating point, taken from terminal
     * @param sign - arithmetic operation
     * @return Result value after calculation
     */
    private static Double workCalc(Double num1, Double num2, String sign) {
        Double res = 0.0;
        switch (sign) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                if (num2.intValue() == 0) {
                    System.out.println("Деление на 0!");
                    return null;
                } else {
                    res = num1 / num2;
                }
                break;

            default:
                System.out.println("Действие на найдено в калькуляторе");
        }

        return res;
    }

    /**
     * @param num1 - number with floating point, taken from terminal
     * @param num2 - number with floating point, taken from terminal
     * @return - sum of numbers, round 4 points after a point
     */
    private static String doCalculation(Double num1, Double num2) {
        DecimalFormat df = new DecimalFormat("#.####");
        String formatted = df.format(num1 + num2);
        return formatted;
    }
}
