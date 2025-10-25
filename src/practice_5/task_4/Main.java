package practice_5.task_4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        SeaCreature seaAnimal = new Shark();
        aquarium.setSeaCreature(seaAnimal);
        aquarium.showMovement();

        seaAnimal = new Starfish();
        aquarium.setSeaCreature(seaAnimal);
        aquarium.showMovement();
    }
}
