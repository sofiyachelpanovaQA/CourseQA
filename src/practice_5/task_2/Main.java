package practice_5.task_2;

public class Main {
    public static void main(String[] args) {
        PetManager petManager1 = new PetManager();

        Pet pet = new Dog();
        petManager1.setPet(pet);
        petManager1.handlePet();

        pet = new Cat();
        petManager1.setPet(pet);
        petManager1.handlePet();
    }
}
