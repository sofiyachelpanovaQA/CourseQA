package practice_9;

import java.util.Arrays;
import java.util.List;

public class BaseOperations {
    public static void main(String[] args) {
        //1. Фильтрация строк по длине больше 5
        List<String> stringList = Arrays.asList("У", "Лукоморья", "Дуб", "Зеленый");
        List<String> filteredStringListByLength = stringList.stream()
                .filter(str -> str.length() > 5)
                .toList();
        System.out.println("Cтроки длиной более 5 символов: " + filteredStringListByLength);

        //2. Фильтрация чисел, кратных 5
        List<Integer> numberList = Arrays.asList(1, 2 , 5, 7, 15, 45);
        List<Integer> numbersMultiplesOfFive = numberList.stream()
                .filter(num -> num % 5 == 0)
                .toList();
        System.out.println("Числа кратные пяти: " + numbersMultiplesOfFive);

        //3. Преобразование строк в их длины (используется список stringList из задания 1)
        List<Integer> stringLengths = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("Длины строк: " + stringLengths);

        //4. Создание списка квадратов чисел (используется список из задания 2)
        System.out.println(numberList.stream()
                .map(num -> (int) Math.pow(num, 2))
                .toList());

        //5. Удаление дубликатов из списка
        List<String> stringList2 = Arrays.asList("У", "Лукоморья", "Дуб", "Зеленый", "Лукоморья");
        System.out.println(stringList2.stream()
                .distinct()
                .toList()
        );

    }
}
