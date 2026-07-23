
interface MessageSender {
    void sendMessage(String message);
}


class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}


class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


class NotificationService {

    private MessageSender messageSender;

    
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String message) {
        messageSender.sendMessage(message);
    }
}


public class Main3 {

    public static void main(String[] args) {

        
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotification =
                new NotificationService(emailSender);

        emailNotification.alertUser("Your order has been shipped.");

        System.out.println();


        MessageSender smsSender = new SMSSender();
        NotificationService smsNotification =
                new NotificationService(smsSender);

        smsNotification.alertUser("Your OTP is 123456.");
    }
}
