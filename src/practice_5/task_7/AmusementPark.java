package practice_5.task_7;

public class AmusementPark {
    Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        System.out.println("Инфо для постителей: " + attraction.info());
        System.out.println("Требуемое обслуживание : " + attraction.maintain());

    }
}
