package com.jatinder.creational.factory.simple;

public class SeaTransport implements Transport{
    @Override
    public String transportType() {
        return "SHIP";
    }
}
