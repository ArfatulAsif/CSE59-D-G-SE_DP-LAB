
class NumberChecker {
    
    
    void check(int num) {
        
        boolean result = (num % 2 == 0) && (num > 10);
        
        System.out.println("Is the number even and greater than 10? " + result);
    }
}


public class Main2 {
    public static void main(String[] args) {
        
        NumberChecker checker = new NumberChecker();
        
        
        checker.check(14);
    }
}
    
