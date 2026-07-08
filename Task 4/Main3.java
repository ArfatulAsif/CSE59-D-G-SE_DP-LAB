interface MessageSender{
    void sendMessage(String message);
}
class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending Email: " + message);
    }
}
class SMSSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending SMS: "+ message);
    }
}
class NotificationService{
    private MessageSender messageSender;
    public  NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    public void alterUser(String msg){
        messageSender.sendMessage(msg);
    }
}
public class Main3 {
    public static void main(String[] args){
        MessageSender email = new EmailSender();
        NotificationService emailService = new NotificationService(email);
        emailService.alterUser("Your order has been shipped");
        System.out.println();
        MessageSender sms = new SMSSender();
        NotificationService smsService = new NotificationService(sms);
        smsService.alterUser("Your OTP is 123456");
    }
    
}

