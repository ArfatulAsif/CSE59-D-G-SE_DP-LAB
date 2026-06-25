class User{
    private String username;
    private String email;

    public User(String username, String email){
        this.username=username;
        this.email=email;
    }

    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
}

 class Emailvalidator{
    public static boolean isValid(String email){
        if( email!=null && email.contains("@")){
            return true;
        }
        System.out.println("Invalid Format");
        return false;
    }
}

class UserRepository{
    public void save( User user){
        System.out.println("Connecting to database");
        System.out.println("saving user "+ user.getUsername() + "to the users table");
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User(
        "Enamul",
        "enamul@gmail.com"

        );
        if(Emailvalidator.isvalid(user.getEmail())){
            UserRepository repository= new UserRepository();
        repository.save(user);
        }
    }
}
