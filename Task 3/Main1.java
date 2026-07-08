package lab03;
 class User{
     private String username;
     private String email;
     
     public User(String username,String email){
         this.username=username;
         this.email=email;
     
     }
     
     public String getusername(){
         return username;
     }
     public String getemail(){
         return email;
     }
     
 }

 class EmailValidator{  
     public static boolean isValid(String email){
         if(email != null && email.contains("@")){
             return true;
         }
         System.out.println("Invalid email format");
         return false;
     }
     
 }
 class UserRepository{
       public void save(User user){
           if(EmailValidator.isValid(user.getemail())){
           System.out.println("connecting to database...");
           System.out.println("saving user "+user.getusername()+" to the users table");
           }
       }
 }
public class Main1 {
    public static void main(String[]args){
        User user=new User("Anika","farjanaanika@gmail.com");
        UserRepository repository=new UserRepository();
        repository.save(user);
    }
    
}

