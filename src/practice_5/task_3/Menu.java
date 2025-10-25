package practice_5.task_3;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void printMenu() {
        dish.getDescription();
    }
}
