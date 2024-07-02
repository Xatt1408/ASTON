import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String[] wordsArray = {"яблоко", "банан", "апельсин", "яблоко", "банан", "киви", "лимон", "киви", "груша", "яблоко", "яблоко", "банан"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(wordsArray));

        System.out.println("Уникальные слова: " + uniqueWords + "\n");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а)");
        }
    }
}