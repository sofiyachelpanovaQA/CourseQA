package practice_4;

public class University {
    static String universityName;

    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static {
        universityName = "MSU";
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Университет: " + universityName + ", имя студента: " + studentName + " ID студента: " + studentID);
    }

    public static void main(String[] args) {
        University student1 = new University(0, "Ivan");
        University student2 = new University(1, "Petya");
        University student3 = new University(2, "Mariya");
        University.changeUniversityName("MFTI");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
