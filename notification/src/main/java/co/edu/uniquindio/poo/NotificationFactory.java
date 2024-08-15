package co.edu.uniquindio.poo;

public class NotificationFactory {

    public NotificationService CreateNotification(String type){

        switch (type.toLowerCase()) {
            case "Email":
                return new EmailNotification();
            
            case "SMS":
                return new SmsNotification();

            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
    
}
