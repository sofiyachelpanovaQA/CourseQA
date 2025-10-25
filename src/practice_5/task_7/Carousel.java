package practice_5.task_7;

public class Carousel implements Attraction {
    @Override
    public String info() {
        return "Спокойный аттракцион";
    }

    @Override
    public String maintain() {
        return "Тех. обслуживание";
    }
}
