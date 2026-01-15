package practice_8.task_6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPrinter {
    static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        printArray(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Кот", "Лось", "Кабан", "Пингвин", "Гиппопотам"));
        printArray(stringArrayList);
    }

    public static <T> void printArray(ArrayList<T> elements) {
        for (T element: elements) {
            System.out.println(element);
        }
    }
}
