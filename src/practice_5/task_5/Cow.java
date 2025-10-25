package practice_5.task_5;

public class Cow implements Careable {
    @Override
    public void feed() {
        System.out.println("Корова накормлена травой");
    }

    @Override
    public void care() {
        System.out.println("Корова выпущена на выпас");
    }

    @Override
    public void produce() {
        System.out.println("Корова дала молоко");
    }
}
