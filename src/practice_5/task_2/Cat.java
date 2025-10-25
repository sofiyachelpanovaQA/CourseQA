package practice_5.task_2;

public class Cat extends Pet {
    @Override
    void feed() {
        System.out.println("Кошка накормлена влажным кормом");
    }

    @Override
    void interact() {
        System.out.println("С кошкой поиграли");
    }
}
