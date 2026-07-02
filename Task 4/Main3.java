public class Main {
 
    
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
 
        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Welcome!");
 
        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("OTP: 123456");
    }
}
