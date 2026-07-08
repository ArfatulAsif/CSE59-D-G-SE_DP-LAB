class TeamMember{
    protected String name;

    public TeamMember(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
    }
}
interface BonusEligible{
    void calculateBonus();
}

class Employee extends TeamMember implements BonusEligible{
    public Employee(String name){
        super(name);
    }
    public void calculateBonus(){
        System.out.println(name + ": Calculating standard employee bonus...");
    }
}
class Contractor extends TeamMember{
    public Contractor(String name){
        super(name);
    }
    public void work(){
        System.out.println(name + ": Working as a contractor.");
    }
}
public class Main1{
    public static void main(String[] args){
        TeamMember employee = new Employee("Alice");
        TeamMember contractor = new Contractor("Bob");

        employee.displayInfo();
        contractor.displayInfo();

        System.out.println();

        BonusEligible bonusEmployee = new Employee("Charlie");
        bonusEmployee.calculateBonus();
        System.out.println();
        Contractor c = new Contractor("David");
        c.work();
    }
}
