package practice_7;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOperations {
    public static void main(String[] args) {

        // задача 1. Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(arrayList1);
        arrayList1.add(6);
        System.out.println(arrayList1);

        // задача 2. Напишите программу, которая выводит все чётные числа из ArrayList
        arrayList1.forEach(
                element -> {
                    if (element % 2 == 0) {System.out.print(element + " ");}
                }
        );
        System.out.println();

        // задача 3. Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Кот", "Лось", "Кабан", "Пингвин", "Гиппопотам"));
        String longest = arrayList2.getFirst();
        for (String str : arrayList2) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println(longest);

        // задача 4. Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        for (int i = 0; i < arrayList3.size(); i++) {
            sum = sum + arrayList3.get(i);
        }
        System.out.println("Сумма чисел в списке: " + sum);

        // Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
        // используется массив из задачи 4
        int max = arrayList3.getFirst();
        for (int i = 0; i < arrayList3.size(); i++) {
            if (arrayList3.get(i) > max) {
                max = arrayList3.get(i);
            }
        }
        System.out.println("Максимальное число в списке: " + max);
    }
}
