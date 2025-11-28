package practice_7;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuesOperations {
    static void main(String[] args) {

        // PriorityQueue
        //Задача 1:
        //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        //ArrayDeque
        //Задача 2:
        //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("Задача 1");
        arrayDeque.push("Задача 2");
        arrayDeque.push("Задача 3");
        arrayDeque.push("Задача 4");
        arrayDeque.push("Задача 5");

        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pop());
        }
    }





}
