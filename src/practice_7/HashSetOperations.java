package practice_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetOperations {
    public static void main(String[] args) {

        // Задача 1. Создайте HashSet из 5 чисел и выведите его содержимое.
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(hashSet1);

        // Задача 2. Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
        // в решении данной задачи используется множество из задачи 1
        hashSet1.add(6);
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(9);
        hashSet1.add(11);
        if (hashSet1.contains(10)) {
            System.out.println("Множество содержит число 10");
        } else System.out.println("Множество НЕ содержит число 10");

        // Задача 3 вызов метода
        List<String> myList = Arrays.asList("a", "b", "c", "a", "a");
        System.out.println("Множество после удаления дубликатов: " + HashSetOperations.removeDuplicates(myList));

        // Задача 4. Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше
        // имя в множестве, и выводит соответствующее сообщение.
        HashSet<String> namesList = new HashSet<>(Arrays.asList("Иван", /*"София", */"Александр", "Виктория"));
        if (namesList.contains("София")) {
            System.out.println("Ваше имя есть в списке");
        } else System.out.println("Вашего имени НЕТ в списке");


    }

    // Задача 3. Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
    public static Set<String> removeDuplicates(List<String> input) {
        return new HashSet<>(input);
    }
}
