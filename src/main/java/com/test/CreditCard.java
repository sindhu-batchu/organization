package com.test;

public class CreditCard {

    private static CreditCard instance;

    public static CreditCard getInstance() {
        if(null != instance) {
            instance = new CreditCard();
        }
        return instance;
    }
}
