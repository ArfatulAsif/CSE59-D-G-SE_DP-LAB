public class Main1 {
    public static void main(String[] args){
        User user = new User("johm_doe","john@example.com");
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();
        if(validator.isValidEmail(user.getEmail())){
            repository.save(user);
        }
    }
    
}
class User{
    private String username;
    private String email;

    public User(String username,String email){
        this.username = username;
        this.email = email;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
}
class UserValidator {
    public boolean isValidEmail(String email){
        if(email != null && email.contains("@")){
            return true;
        }
        System.out.println("Invalid email format.");
        return false;
    }
}
class UserRepository{
    public void save(User user){
        System.out.println("Connecting to database.....");
        System.out.println("Saving user" + user.getUsername() + "to the user table."); 
    }
}

