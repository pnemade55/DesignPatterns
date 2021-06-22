package com.pn.dpatterns.abfactory;

/**
 * created by : pnema
 * on 6/22/2021
 */
public class NotificationFactory {
    public static Notification getNotification(NotificationAbstractFactory notificationAbstractFactory){
        return notificationAbstractFactory.createNotification();
    }
}
