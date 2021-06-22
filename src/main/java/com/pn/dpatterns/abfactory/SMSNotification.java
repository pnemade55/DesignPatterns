package com.pn.dpatterns.abfactory;

/**
 * created by : pnema
 * on 6/22/2021
 */
public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS... sent!!");
    }
}
