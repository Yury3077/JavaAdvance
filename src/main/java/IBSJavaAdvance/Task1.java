package IBSJavaAdvance;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author - Balykov Yury
 * @See - A Simple calculator
 */
public class Task1 {
    /**
     * Start point, get values from user, call calculate method
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи число 1: ");
        Double num1 = console.nextDouble();

        System.out.print("Введи число 2: ");
        Double num2 = console.nextDouble();

        System.out.println(String.format("Результат сложения: %s", doCalculation(num1, num2)));

        console.close();
    }

    /**
     * @param num1 - number with floating point, taken from terminal
     * @param num2 - number with floating point, taken from terminal
     * @return - sum of numbers, round 4 points after a point
     */
    public static String doCalculation(Double num1, Double num2) {
        DecimalFormat df = new DecimalFormat("#.####");
        String formatted = df.format(num1 + num2);
        return formatted;
    }
}
