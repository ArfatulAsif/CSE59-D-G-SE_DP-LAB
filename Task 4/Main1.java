abstract class TeamMember {
    String name;
    TeamMember (String name){
        this.name=name;
    }
}
 interface Bonus {

    void calculateBonus();

}

class Employee extends TeamMember implements Bonus{

    Employee(String name){
        super(name);
    }

    public void calculateBonus (){
        System.out.println(name+ " gets a bonus.");
    }
}

class Contractor extends TeamMember {

    Contractor(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

public class Main {
    public static void main(String[] args){
        Employee e = new Employee("Alice") {
            @Override
            public void calculateBonus() {
                System.out.println("Special bonus");
            }
        };
        Contractor c = new Contractor("Bob");

        e.calculateBonus();
        c.work();
    }
}
