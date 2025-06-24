package Java2;

import java.util.Scanner;

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Email Notification sent.");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("SMS Notification sent.");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        return null;
    }
}

public class D2J4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter notification type (email/sms): ");
        String type = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(type);

        if (notification != null) {
            notification.notifyUser();
        } else {
            System.out.println("Invalid notification type.");
        }
    }
}
