package practice_5.task_8;

import practice_5.task_7.Attraction;

public class Museum {
    Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        System.out.println("История : " + exhibit.describe());
        System.out.println("Условие хранения : " + exhibit.preserve());

    }
}
