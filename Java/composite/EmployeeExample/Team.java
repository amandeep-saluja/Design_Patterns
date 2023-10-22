package composite.EmployeeExample;

import java.util.ArrayList;
import java.util.List;

public class Team implements EmployeeComponent {
    private final String name;
    private List<EmployeeComponent> members;

    public Team(String name) {
        this.name = name;
    }

    public void addMember(EmployeeComponent member) {
        if(null == members) {
            members = new ArrayList<>();
        }
        members.add(member);
    }

    public void removeMember(EmployeeComponent member) {
        if(null != members) {
            members.remove(member);
        }
    }

    @Override
    public void displayInfo() {
        if(null != members && !members.isEmpty()) {
            System.out.println("\tTeam name: " + name + " containing members as follows: ");
            this.members.forEach(EmployeeComponent::displayInfo);
        }
        else {
            System.out.println("\tTeam name: " + name + " with no members");
        }
    }

    @Override
    public Double calculateSalary() {
        return this.members.stream().reduce(0.0, (partialResult, member) -> partialResult + member.calculateSalary(), Double::sum);
    }
}
