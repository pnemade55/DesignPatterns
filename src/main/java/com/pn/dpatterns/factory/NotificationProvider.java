package com.pn.dpatterns.factory;

/**
 * created by : pnema
 * on 6/7/2021
 */
public class NotificationProvider {
    public static Notification getNotificationSender(String input)
    {
        if( input== null || input.isEmpty()){
            throw new NoNotificationProviderException("Invalid input: " + input);
        } else if(input.equalsIgnoreCase("sms")){
            return new SMSNotification();
        } else if(input.equalsIgnoreCase("email")){
            return new EmailNotification();
        }
        return null;
    }
}
