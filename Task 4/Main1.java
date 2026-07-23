class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface BonusEligible {
    void calculateBonus();
}
class Employee extends TeamMember implements BonusEligible {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println(name + ": Calculating standard employee bonus...");
    }
}

class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is working as a contractor.");
    }
}
public class Main1 {
    public static void main(String[] args) {

        Employee employee = new Employee("Alice");
        Contractor contractor = new Contractor("Bob");

        // Employee can receive a bonus
        employee.calculateBonus();

        // Contractor works but does not receive a bonus
        contractor.work();

        // Both are TeamMembers
        TeamMember member1 = employee;
        TeamMember member2 = contractor;

        System.out.println("\nTeam Members:");
        System.out.println(member1.getName());
        System.out.println(member2.getName());
    }
}
