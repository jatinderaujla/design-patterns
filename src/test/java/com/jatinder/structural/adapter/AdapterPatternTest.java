package com.jatinder.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPatternTest {

    @Test
    void showBalance() {
        MobilePay mobilePay = new MobilePay(new FirstBankAdapter());
        double balance = mobilePay.showBalance();
        assertEquals(1000.00, balance);

        MobilePay mobilePay1 = new MobilePay(new SecondBankAdapter());
        double balance1 = mobilePay1.showBalance();
        assertEquals(5000.00, balance1);
    }

    @Test
    void sendMoney() {
        MobilePay mobilePay = new MobilePay(new FirstBankAdapter());
        String status = mobilePay.sendMoney("ABC", 1000.00);
        assertEquals("SUCCESS", status);
        String statusF = mobilePay.sendMoney("ABC", 0.5);
        assertEquals("FAILED", statusF);

        MobilePay mobilePay1 = new MobilePay(new SecondBankAdapter());
        String status1 = mobilePay1.sendMoney("XYZ", 1000.00);
        assertEquals("SUCCESS", status1);
        String status2 = mobilePay1.sendMoney("ABC", 0.9);
        assertEquals("FAILED", status2);
    }
}