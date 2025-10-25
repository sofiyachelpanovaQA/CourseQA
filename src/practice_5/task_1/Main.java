package practice_5.task_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal animal = new Bird();
        zoo.setAnimal(animal);
        zoo.showBehavior();

        animal = new Elephant();
        zoo.setAnimal(animal);
        zoo.showBehavior();
    }
}
