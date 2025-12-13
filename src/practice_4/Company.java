package practice_4;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        printCompanyName();
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    static {
        companyName = "Sun";
    }

    public static void main (String[] args) {
        Company employee1 = new Company(0, "Ivan");
        Company employee2 = new Company(1, "Aleksandr");
        Company employee3 = new Company(2, "Mariya");
        //employee3.employeeID = 3;
    }
}
