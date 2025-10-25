package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish dish = new HotDish("Паста", 60);
        menu.addDish(dish);
        menu.printMenu();

        dish = new Drink("Лимонад", 400);
        menu.addDish(dish);
        menu.printMenu();
    }
}
