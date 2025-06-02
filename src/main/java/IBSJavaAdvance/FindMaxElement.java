package IBSJavaAdvance;

import java.util.Scanner;

public class FindMaxElement {
    public static String getMaxArrayElem() {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи число элементов в массиве: ");
        int numElems = console.nextInt();
        String[] arrayOfWords = new String[numElems];

        for (int elem = 1; elem <= numElems; elem++) {
            System.out.print(String.format("Введи элемент №%s в массиве: ", elem));
            String word = console.next();
            arrayOfWords[elem - 1] = word;
        }

        console.close();

        for (int elem = 0; elem < numElems; elem++) {
            System.out.println(String.format("Элемент массива №%s: %s", elem + 1, arrayOfWords[elem]));
        }

        int maxValue = 0;
        String maxWord = null;
        for (String word : arrayOfWords) {
            if (word.length() > maxValue) {
                maxValue = word.length();
                maxWord = word;
            }
        }

        return maxWord;
    }
}
