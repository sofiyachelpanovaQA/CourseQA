package practice_5.task_2;

public class Dog extends Pet {
    @Override
    public void feed() {
        System.out.println("Собака накормлена сухими кормом");
    }

    @Override
    public void interact() {
        System.out.println("С собакой погуляли");
    }
}
