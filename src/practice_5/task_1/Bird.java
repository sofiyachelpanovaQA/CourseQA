package practice_5.task_1;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    void move() {
        System.out.println("Птица летает");
    }

}
