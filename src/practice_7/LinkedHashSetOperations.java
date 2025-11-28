package practice_7;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
    public static void main(String[] args) {

        // Задача 1. Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("Задача 233");
        linkedHashSet1.add("Задача 564");
        linkedHashSet1.add("Задача 777");
        linkedHashSet1.add("Задача 123");
        System.out.println(linkedHashSet1); //элементы выводятся в порядке добавления так как это linkedHashSet а не HashSet

        //Задача 2. Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("Задача 111");
        linkedHashSet2.add("Задача 222");
        linkedHashSet2.add("Задача 333");
        linkedHashSet2.add("Задача 111");
        linkedHashSet2.add("Задача 222");
        System.out.println(linkedHashSet2); // коллекции Set исключает дубликаты, доп проверка не требуется

    }



}
