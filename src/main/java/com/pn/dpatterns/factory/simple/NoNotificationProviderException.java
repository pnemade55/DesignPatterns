package com.pn.dpatterns.factory.simple;

/**
 * created by : pnema
 * on 6/7/2021
 */
public class NoNotificationProviderException extends RuntimeException {
    NoNotificationProviderException(String msg){
        super(msg);
    }
}
