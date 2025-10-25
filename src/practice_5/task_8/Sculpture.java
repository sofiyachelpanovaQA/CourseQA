package practice_5.task_8;

public class Sculpture implements Exhibit {
    @Override
    public String describe() {
        return "Скултптурный объект";
    }

    @Override
    public String preserve() {
        return "Реставрация";
    }
}
