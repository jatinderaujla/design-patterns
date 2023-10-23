package com.jatinder.structural.adapter;

import com.jatinder.structural.adapter.thirdparty.api.SecondBankAPI;

public class SecondBankAdapter implements BankAPI{

    SecondBankAPI secondBankAPI = new SecondBankAPI();
    @Override
    public double checkBalance() {
        String userAccNo = "123456";
        return secondBankAPI.checkAccountBalance(userAccNo);
    }

    @Override
    public String sendMoney(String from, String to, double amount) {
        boolean status = secondBankAPI.payTo(from, to, amount);
        if(status) return "SUCCESS";
        return "FAILED";
    }
}
