package practice_7;

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {

        //Задача 1:
        //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Пупа", 60);
        hashMap1.put("Лупа", 30);
        hashMap1.put("Вова", 80);
        hashMap1.put("Виктор", 10);
        hashMap1.put("Фрося", 5);

        System.out.println(hashMap1);


        //Задача 2:
        //Проверьте, есть ли определённое имя в HashMap.
        System.out.println(hashMap1.containsKey("Лупа"));

        //Задача 3:
        //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        hashMap1.forEach(
                (key, value) -> {
                    if (value < 18) {System.out.println(key + " " + value);}
                }
        );
    }
}
