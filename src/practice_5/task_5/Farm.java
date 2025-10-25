package practice_5.task_5;

public class Farm {
    Careable animal;

    public void setAnimal(Careable animal) {
        this.animal = animal;
    }

    public void serviceAnimal() {
        animal.feed();
        animal.care();
        animal.produce();
    }
}
