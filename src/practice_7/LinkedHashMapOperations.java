package practice_7;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashMapOperations {


    public static void main(String[] args) {


        LinkedHashMap<String, String> userHistory = new LinkedHashMap<>() {
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                // Если размер превышает вместимость, удаляем старый элемент
                return size() > 10;
            }
        };
        userHistory.put("Страница авторизации", "Ввод логина");
        userHistory.put("Страница авторизации2", "Ввод пароля");
        userHistory.put("Главная страница", "Просмотр содержимого");
        userHistory.put("Страница расчетов", "Просмотр содержимого");
        userHistory.put("Страница расчетов2", "Запуск расчета");
        userHistory.put("Логи", "Просмотр логов");
        userHistory.put("Логи2", "Запуск логирования");
        userHistory.put("Поиск", "Ввод поиска");
        userHistory.put("Поиск2", "Поиск");
        userHistory.put("Страница расчета", "Редактирование");
        userHistory.put("Страница расчета2", "Удаление");
        userHistory.put("Страница расчета3", "Удаление");


        for (Map.Entry<String, String> entry : userHistory.entrySet()) {
            String page = entry.getKey();
            String action = entry.getValue();
            System.out.println("Страница: " + page + "; Действие пользователя: " + action);
        }
        System.out.println(userHistory.size());

    }
    // Задача 3:
    //Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).

}
