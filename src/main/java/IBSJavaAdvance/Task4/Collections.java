package IBSJavaAdvance.Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        File file = new File("src/main/java/IBSJavaAdvance/Task4/SomeText.txt");
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()))) {
            line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> counterWords = countSameWords(line);
        System.out.println(counterWords);
        LinkedList<Object> result = getMostCommonWord(counterWords);
        System.out.println("Самое распространенное слово: " + result.get(0));
        System.out.println(String.format("Самое распространненное слово встречается %s раз(а)", result.get(1)));

    }

    public static String[] sortWords(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words);

        return words;
    }

    public static HashMap<String, Integer> countSameWords(String text) {
        HashMap<String, Integer> countWords = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                countWords.put(word, 1);
            }
        }
        return countWords;
    }

    public static LinkedList<Object> getMostCommonWord(HashMap<String, Integer> countText) {
        String maxWord = null;
        Integer maxCommonCount = Integer.MIN_VALUE;
        for (String word : countText.keySet()) {
            if (countText.get(word) > maxCommonCount) {
                maxCommonCount = (countText.get(word));
                maxWord = word;
            }
        }
        LinkedList<Object> maxCommonList = new LinkedList<>();
        maxCommonList.add(maxWord);
        maxCommonList.add(maxCommonCount);

        return maxCommonList;
    }
}
