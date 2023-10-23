package com.jatinder.creational.factory;

import com.jatinder.creational.factory.abstractfactory.MobileApp;
import com.jatinder.creational.factory.abstractfactory.PlatformOS;
import com.jatinder.creational.factory.abstractfactory.UIComponent;
import com.jatinder.creational.factory.abstractfactory.components.Button;
import com.jatinder.creational.factory.simple.DeliverVia;
import com.jatinder.creational.factory.simple.LogisticsApp;
import com.jatinder.creational.factory.simple.Transport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryPatternTest {
    @Test
    void factoryPatternTest() {
        LogisticsApp logisticsApp = new LogisticsApp();
        logisticsApp.companyName();

        Transport seaTransport = logisticsApp.createTransport(DeliverVia.SEA);
        assertEquals("SHIP", seaTransport.transportType());

        Transport airTransport = logisticsApp.createTransport(DeliverVia.AIR);
        assertEquals("AIRPLANE", airTransport.transportType());

        Transport roadTransport = logisticsApp.createTransport(DeliverVia.ROAD);
        assertEquals("TRUCK", roadTransport.transportType());

    }

    void abstractFactoryPatternTest() {
        MobileApp mobileApp = new MobileApp();
        mobileApp.appName();
        mobileApp.version();

        UIComponent androidUiComponent = mobileApp.createUI(PlatformOS.ANDROID);
        Button androidButton = androidUiComponent.createButton();
        assertEquals("Android Button", androidButton.label());

        UIComponent iosUiComponent = mobileApp.createUI(PlatformOS.ANDROID);
        Button iosButton = iosUiComponent.createButton();
        assertEquals("Ios Button", iosButton.label());

    }
}
