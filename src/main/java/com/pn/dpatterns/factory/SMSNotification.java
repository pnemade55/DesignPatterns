package com.pn.dpatterns.factory;

/**
 * created by : pnema
 * on 6/7/2021
 */
public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending an SMS.... SMS Sent");
    }
}
