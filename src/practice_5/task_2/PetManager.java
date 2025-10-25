package practice_5.task_2;

public class PetManager {
    Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void handlePet() {
        pet.feed();
        pet.interact();
    }
}
