

interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {

    private MessageSender messageSender;

    // Dependency Injection (DIP applied)
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

public class Main {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Hello via Email");

        MessageSender sms = new SMSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("Hello via SMS");
    }
}
