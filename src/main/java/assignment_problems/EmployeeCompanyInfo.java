package assignment_problems;

public class EmployeeCompanyInfo {
    public static void main(String[] args) {
        Employee first = new Employee("E-101", "Divya", 65000);
        Employee second = new Employee("E-102", "Arjun", 60000);
        Employee third = new Employee("E-103", "Priya", 70000);

        System.out.println("3 Employee objects created");
        Employee.printCompanyInfo();
    }
}
