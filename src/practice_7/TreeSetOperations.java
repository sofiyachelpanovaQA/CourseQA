package practice_7;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {

        // Задача 1. Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(20);
        treeSet1.add(11);
        treeSet1.add(88);
        treeSet1.add(0);

        System.out.println(treeSet1);

        // Задача 3. Найдите ближайшее большее и меньшее число к заданному в TreeSet.
        System.out.println(treeSet1.higher(15));
        System.out.println(treeSet1.lower(15));

    }
}
