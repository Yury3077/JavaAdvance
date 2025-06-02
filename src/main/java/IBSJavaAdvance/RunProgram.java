package IBSJavaAdvance;

import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи номер задания для выполнения (1 - калькулятор, 2 - поиск макс. элемента в массиве: ");
        int taskNumber = console.nextInt();

        if (taskNumber == 1) {
            System.out.println(String.format("Результат операции: %s", Calculator.calculateMe()));
        } else if (taskNumber == 2) {
            System.out.println(String.format("Max элемент массива: %s", FindMaxElement.getMaxArrayElem()));
        } else {
            System.out.println("Номер задания не найден! Пока!");
        }
    }
}
