package practice_5.task_5;

public class Main {
    public static void main(String[] args) {
        Farm myFarm = new Farm();

        Careable farmAnimal = new Cow();
        myFarm.setAnimal(farmAnimal);
        myFarm.serviceAnimal();

        farmAnimal = new Chicken();
        myFarm.setAnimal(farmAnimal);
        myFarm.serviceAnimal();
    }
}
