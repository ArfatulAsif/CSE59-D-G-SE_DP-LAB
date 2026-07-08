package lab04;


public class Main1 {
    static class TeamMember{
        protected String name;
        public TeamMember(String name){
          this.name=name;
        }
        public void work(){
            System.out.println(name + "is working.");
        }
    }
    
    static class Employee extends TeamMember{
       public Employee(String name){
           super(name);
       } 
       public void calculateBonus(){
           System.out.println( "calculating standard employee bonus...");
       }
    }
    
    static class Contractor extends TeamMember{
        public Contractor(String name){
        super(name);
        }
        public void submitInvoice(){
        System.out.println( name+ " submitted an invoice for payment.");
        }
    }
    
    public static void main (String[]args){
    Employee emp=new Employee("Alice");
    Contractor cont=new Contractor("Bob");
    
    emp.work();
    emp.calculateBonus();
    cont.work();
    cont.submitInvoice();
    
    }
}
