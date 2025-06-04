package IBSJavaAdvance.Task3;

import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int index = 0; index < numbers.length; index++) {
            Random randomNum = new Random();
            int min = -10;
            int max = 10;
            int res = randomNum.nextInt(max - min + 1) + min;
            numbers[index] = res;
            System.out.println(res);
        }

        int[] resMax = getMaxValue(numbers);
        int[] resMin = getMinValue(numbers);
        numbers[resMax[1]] = resMin[0];
        numbers[resMin[1]] = resMax[0];
    }

    public static int[] getMaxValue(int[] arrayNumbers) {
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = 0;

        for (int index = 0; index < arrayNumbers.length; index++) {
            if (arrayNumbers[index] > maxValue) {
                maxValue = arrayNumbers[index];
                maxValueIndex = index;
            }
        }

        int[] data = new int[2];
        data[0] = maxValue;
        data[1] = maxValueIndex;

        return data;
    }

    public static int[] getMinValue(int[] arrayNumbers) {
        int minValue = Integer.MAX_VALUE;
        int minValueIndex = 0;

        for (int index = 0; index < arrayNumbers.length; index++) {
            if (arrayNumbers[index] < minValue) {
                minValue = arrayNumbers[index];
                minValueIndex = index;
            }
        }

        int[] data = new int[2];
        data[0] = minValue;
        data[1] = minValueIndex;

        return data;
    }
}
