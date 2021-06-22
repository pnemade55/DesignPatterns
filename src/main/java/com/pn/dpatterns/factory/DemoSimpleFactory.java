package com.pn.dpatterns.factory;

/**
 * created by : pnema
 * on 6/7/2021
 */
public class DemoSimpleFactory {
    public static void main(String[] args) {
        NotificationProvider.getNotificationSender("sms").send();
        NotificationProvider.getNotificationSender("email").send();
        NotificationProvider.getNotificationSender("").send();  //NoNotificationProviderException
        NotificationProvider.getNotificationSender(null); //NoNotificationProviderException
    }

}
