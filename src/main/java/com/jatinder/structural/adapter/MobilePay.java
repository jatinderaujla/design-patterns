package com.jatinder.structural.adapter;

public class MobilePay {

    private final BankAPI bankAPI;

    public MobilePay(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public double showBalance(){
        return bankAPI.checkBalance();
    }

    public String sendMoney(String beneficiary, double amount){
        return bankAPI.sendMoney("MY_ACC_NO", beneficiary, amount);
    }


}
