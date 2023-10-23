package com.jatinder.structural.adapter.thirdparty.api;

public class SecondBankAPI {
    public double checkAccountBalance(String accountNo){
        return 5000.00;
    }

    public boolean payTo(String from, String to, double amount){
        return amount >= 1;
    }
}
