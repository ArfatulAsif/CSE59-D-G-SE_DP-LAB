// TeamMember.java
abstract class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// BonusEligible.java
interface BonusEligible {
    void calculateBonus();
}

// Employee.java
class Employee extends TeamMember implements BonusEligible {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

// Contractor.java
class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {

        TeamMember employee = new Employee("Alice");
        TeamMember contractor = new Contractor("Bob");

        System.out.println("Employee: " + employee.getName());
        System.out.println("Contractor: " + contractor.getName());

        BonusEligible eligibleEmployee = new Employee("Charlie");
        eligibleEmployee.calculateBonus();
    }
}
