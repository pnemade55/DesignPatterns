package com.pn.dpatterns.factory.simple;

/**
 * created by : pnema
 * on 6/7/2021
 */
public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending an Email.... Email Sent");
    }
}
