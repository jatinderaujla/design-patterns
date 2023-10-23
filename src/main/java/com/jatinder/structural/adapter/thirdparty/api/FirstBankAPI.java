package com.jatinder.structural.adapter.thirdparty.api;

public class FirstBankAPI {
    public double viewBalance(){
        return 1000.00;
    }

    public boolean transferMoney(String from, String to, double amount){
        return amount >=1 ;
    }
}
