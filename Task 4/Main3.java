interface MessageSender{
    void sendMessage(String message);

}
class EmailSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class NotificationService{
    private MessageSender sender;
    NotificationService(MessageSender sender ){
        this.sender=sender;
    }

    public void alertUser ( String message){
        sender.sendMessage(message);
            

    }
}

public class Main3 {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();

        NotificationService notification = new NotificationService(email);

        notification.alertUser("Hello User!");
    }
}

