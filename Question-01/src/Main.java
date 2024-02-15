public class Main {
    public static void main(String[] args) {
        // Create new Employee objects
        Employee employee1 = new Employee("John Doe", 50000.0, "Engineering");
        Employee employee2 = new Employee("Jane Smith", 60000.0, "Human Resources");
        System.out.println("Initial Details:");
        System.out.println("Employee 1:");
        employee1.displayDetails();
        System.out.println("Employee 2:");
        employee2.displayDetails();
        employee1.raiseSalary(10); // Raise salary of employee1 by 10%
        employee2.raiseSalary(8); // Raise salary of employee2 by 8%
// Display updated details of employees
        System.out.println("\nUpdated Details after Salary Raise:");
        System.out.println("Employee 1:");
        employee1.displayDetails();
        System.out.println("Employee 2:");
        employee2.displayDetails();
    }
}
