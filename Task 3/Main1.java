
package com.mycompany.main;


public class Main {

    public static void main(String[] args) {
       User user = new User("Rahim","rahim@gmail.com");
       
       if(EmailValidator .isValid(user.getEmail())){
       } else {
           UserRepository repository = new UserRepository();
           repository.save(user);
        }
    }
}
class User{
    
    public User(String username, String email){
    }
}

class EmailValidator{
    
    public static boolean isValid(String email){
        if (email !=null && email.contains("@"));
        return true;
    }
     


class UserRepository {
     
    public void save(User user){
        System.out.println("Connecting to database...");
        System.out.println(
        "Saving user " + user.getUsername() + " to the users table."
        );
    }
 }
