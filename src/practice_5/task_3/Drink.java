package practice_5.task_3;

public class Drink extends Dish {
    private String name;
    private int volume;

    Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println(name + ": объем " + volume + " мл");
    }
}
