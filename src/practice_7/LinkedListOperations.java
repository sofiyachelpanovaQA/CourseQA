package practice_7;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {

        // Задача 1: Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("У", "Лукоморья", "Дуб", "Зеленый", "Пушкин"));
        System.out.println(linkedList1);

        //Задача 2. Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Задача 1");
        linkedList2.add("Задача 2");
        linkedList2.add("Задача 3");
        while (!linkedList2.isEmpty()) {
            System.out.println(linkedList2.poll());
        }


        // Задача 3: Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
        // в данной задаче используется список из задачи 1
        System.out.println("Первый элемент: " + linkedList1.getFirst());
        System.out.println("Последний элемент: " + linkedList1.getLast());



        //Задача 4:
        //Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
        LinkedList<Integer> linkedList3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        for (int num : linkedList3) {
            sum += num;
        }
        System.out.println("Сумма чисел в списке: " + sum);


        //Задача 5:
        //Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        // в данной задаче используется список из задачи 1

        ListIterator<String> itr = linkedList1.listIterator();
        System.out.println("Проход слева-направо: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Проход справа-налево");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
