package lab04;

public class Main3 {

    interface MessageSender {
        void sendMessage(String message);
    }
    static class EmailSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    static class SMSSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Sending SMS: " + message);
        }
    } 
    static class NotificationService {
        private MessageSender messageSender;
        public NotificationService(MessageSender messageSender) {
            this.messageSender = messageSender;
        }

        public void alertUser(String msg) {
            messageSender.sendMessage(msg);
        }
    }

    public static void main(String[] args) {

        MessageSender emailSender = new EmailSender();
        NotificationService emailNotification =
        new NotificationService(emailSender);

        emailNotification.alertUser("Your order has been shipped!");
        MessageSender smsSender = new SMSSender();
        NotificationService smsNotification =
        new NotificationService(smsSender);

        smsNotification.alertUser("Your OTP is 123456.");
    }
}
