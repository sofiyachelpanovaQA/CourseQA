package practice_5.task_6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        Plant myPlant = new Orchid();
        botanicalGarden.setPlant(myPlant);
        botanicalGarden.maintainPlant();

        myPlant = new Cactus();
        botanicalGarden.setPlant(myPlant);
        botanicalGarden.maintainPlant();
    }
}
