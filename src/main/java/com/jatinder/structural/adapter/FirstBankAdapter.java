package com.jatinder.structural.adapter;

import com.jatinder.structural.adapter.thirdparty.api.FirstBankAPI;

public class FirstBankAdapter implements BankAPI{

    private FirstBankAPI firstBankAPI = new FirstBankAPI();
    @Override
    public double checkBalance() {
        return firstBankAPI.viewBalance();
    }

    @Override
    public String sendMoney(String from, String to, double amount) {
        boolean status = firstBankAPI.transferMoney(from, to, amount);
        if(status) return "SUCCESS";
        return "FAILED";
    }
}
