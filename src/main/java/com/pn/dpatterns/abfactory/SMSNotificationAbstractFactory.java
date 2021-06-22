package com.pn.dpatterns.abfactory;

/**
 * created by : pnema
 * on 6/22/2021
 */
public class SMSNotificationAbstractFactory implements NotificationAbstractFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
