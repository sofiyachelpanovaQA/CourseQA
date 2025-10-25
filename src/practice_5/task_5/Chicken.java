package practice_5.task_5;

public class Chicken implements Careable {
    @Override
    public void feed() {
        System.out.println("Курица накормлена зерном");
    }

    @Override
    public void care() {
        System.out.println("Курице установлена кормушка");
    }

    @Override
    public void produce() {
        System.out.println("Курица снесла яйцо");
    }
}
