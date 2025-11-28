package practice_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapOperations {
    static void main(String[] args) {

        // Задача 1:
        //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

        TreeMap<String, Integer> students = new TreeMap<>();
        students.put("Ян", 86);
        students.put("Мария", 100);
        students.put("Ольга", 46);
        students.put("Семен", 55);
        students.put("Антон", 44);


        for(Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println("Имя: " + name + "; Баллы: " + score);
        }
    }
}
