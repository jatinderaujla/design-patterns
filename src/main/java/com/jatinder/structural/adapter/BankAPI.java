package com.jatinder.structural.adapter;

public interface BankAPI {

    double checkBalance();

    String sendMoney(String from, String to, double amount);

}
