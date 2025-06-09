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

        int[] resMax = getMaxNegativeValue(numbers);
        int[] resMin = getMinPositiveValue(numbers);
        numbers[resMax[1]] = resMin[0];
        numbers[resMin[1]] = resMax[0];
    }

    public static int[] getMinPositiveValue(int[] arrayNumbers) {
        int minPositiveValue = Integer.MAX_VALUE;
        int minPositiveValueIndex = 0;

        for (int index = 0; index < arrayNumbers.length; index++) {
            if (arrayNumbers[index] > 0 && arrayNumbers[index] < minPositiveValue) {
                minPositiveValue = arrayNumbers[index];
                minPositiveValueIndex = index;
            }
        }

        int[] data = new int[2];
        data[0] = minPositiveValue;
        data[1] = minPositiveValueIndex;

        return data;
    }

    public static int[] getMaxNegativeValue(int[] arrayNumbers) {
        int maxNegativeValue = Integer.MIN_VALUE;
        int maxNegativeIndex = 0;

        for (int index = 0; index < arrayNumbers.length; index++) {
            if (arrayNumbers[index] < 0 && arrayNumbers[index] > maxNegativeValue) {
                maxNegativeValue = arrayNumbers[index];
                maxNegativeIndex = index;
            }
        }

        int[] data = new int[2];
        data[0] = maxNegativeValue;
        data[1] = maxNegativeIndex;

        return data;
    }
}
