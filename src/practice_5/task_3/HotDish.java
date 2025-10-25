package practice_5.task_3;

public class HotDish extends Dish {
    private String name;
    private int temperature;

    HotDish(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println(name + ": температура " + temperature + " С");
    }
}
