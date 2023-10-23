package com.jatinder.creational.factory.simple;

public class LogisticsApp {

    public String companyName(){
        return "ABC Logistics";
    }

    public Transport createTransport(DeliverVia deliverVia){

        if(DeliverVia.ROAD.equals(deliverVia)) return new RoadTransport();

        else if(DeliverVia.SEA.equals(deliverVia)) return new SeaTransport();

        else if(DeliverVia.AIR.equals(deliverVia)) return new AirTransport();

        return null;
    }
}
