package practice_5.task_7;

public class RollerCoaster implements Attraction {
    @Override
    public String info() {
        return "Острые ощущения";
    }

    @Override
    public String maintain() {
        return "Проверка безопасности";
    }
}
