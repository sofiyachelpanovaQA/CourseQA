package practice_9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingOperation {
   public static void main(String[] args) {

       List<String> words = Arrays.asList("Банан", "Яблоко", "Груша", "Ананас", "Грейпфрут", "Алыча", "гриб");
       Map<Character, List<String>> wordsGroupedByFirstLetter = words.stream()
               .collect(Collectors.groupingBy(w -> Character.toLowerCase(w.charAt(0))));
       System.out.println(wordsGroupedByFirstLetter);


       List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 5, 15);
       Map<String, List<Integer>> sortedNumbersByParity = numbers.stream()
               .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "четные" : "нечетные"));
       System.out.println(sortedNumbersByParity);

       double average = numbers.stream()
               .mapToInt(n -> n)
               .average()
               .orElse(0);
       System.out.println(average);
   }
}
