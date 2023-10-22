package composite.EmployeeExample;

public class Employee implements EmployeeComponent {
    private final String name;
    private final Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("\t\tEmployee name: " + name + " salary: " + salary);
    }

    @Override
    public Double calculateSalary() {
        return salary;
    }
}
