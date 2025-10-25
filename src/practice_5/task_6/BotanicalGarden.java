package practice_5.task_6;

public class BotanicalGarden {
    Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void maintainPlant() {
        System.out.println("Поддерживаются условия:");
        plant.care();
    }
}
