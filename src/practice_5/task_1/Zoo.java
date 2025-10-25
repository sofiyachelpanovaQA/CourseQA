package practice_5.task_1;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showBehavior() {
        System.out.println("===Демонстрация поведения===");
        animal.move();
        animal.makeSound();
    }
}
