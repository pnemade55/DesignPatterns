package com.pn.dpatterns.abfactory;

/**
 * created by : pnema
 * on 6/22/2021
 */
public class DemoAbstractFactoryDP {
    public static void main(String[] args) {
        Notification email= NotificationFactory.getNotification(new EmailNotificationAbstractFactory());
        email.send();

        Notification sms= NotificationFactory.getNotification(new SMSNotificationAbstractFactory());
        sms.send();

    }
}
