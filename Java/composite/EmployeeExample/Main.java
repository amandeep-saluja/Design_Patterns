package composite.EmployeeExample;

public class Main {
    public static void main(String[] args) {
        EmployeeComponent rahul = new Employee("Rahul", 500.0);
        EmployeeComponent kavita = new Employee("Kavita", 400.0);

        Team sales = new Team("Sales");
        sales.addMember(rahul);
        sales.addMember(kavita);

        EmployeeComponent bob = new Employee("Bob", 100.0);

        Team marketing = new Team("Marketing");
        marketing.addMember(bob);

        Department headOffice = new Department("Head Office");
        headOffice.addMember(sales);
        headOffice.addMember(marketing);

        // Display and calculate the total salary for the organization hierarchy
        headOffice.displayInfo();
        double totalSalary = headOffice.calculateSalary();
        System.out.println("Total salary for the organization: Rs."+totalSalary);
    }
}
