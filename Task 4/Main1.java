class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }
}

// Employee gets bonus
class Employee extends TeamMember {

    public Employee(String name) {
        super(name);
    }

    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

// Contractor does not have bonus method
class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }
}

public class Main1 {

    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        Contractor con = new Contractor("Bob");
        emp.calculateBonus();
    }
}
