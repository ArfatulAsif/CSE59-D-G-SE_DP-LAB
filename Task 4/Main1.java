class TeamMember {
    protected String name;
    
    public TeamMember(String name) {
        this.name = name;
    }
}

class Employee extends TeamMember {
    public Employee(String name) {
        super(name);
    }
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

class Contractor extends TeamMember {
    public Contractor(String name) {
        super(name);
    }
    
    public void work() {
        System.out.println("Contractor is working on the project.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahim");
        emp.calculateBonus();
        
        Contractor con = new Contractor("Karim");
        con.work();
    }
}

