package practice_5.task_7;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();

        Attraction attraction = new RollerCoaster();
        amusementPark.setAttraction(attraction);
        amusementPark.operateAttraction();

        attraction = new Carousel();
        amusementPark.setAttraction(attraction);
        amusementPark.operateAttraction();
    }
}
