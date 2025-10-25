package practice_5.task_8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit exhibit = new Manuscript();
        museum.setExhibit(exhibit);
        museum.showExhibit();

        exhibit = new Sculpture();
        museum.setExhibit(exhibit);
        museum.showExhibit();
    }
}
