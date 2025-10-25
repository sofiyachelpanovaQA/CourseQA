package practice_5.task_8;

public class Manuscript implements Exhibit {
    @Override
    public String describe() {
        return "Древний текст";
    }

    @Override
    public String preserve() {
        return "Контролируемая влажность";
    }
}
