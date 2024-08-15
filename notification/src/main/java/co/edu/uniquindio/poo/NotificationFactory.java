package co.edu.uniquindio.poo;

public class NotificationFactory {

    public NotificationService CreateNotification(String type){

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            
            case "sms":
                return new SmsNotification();

            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
    
}
