package com.jatinder.creational.factory.abstractfactory;

public class MobileApp {
    public String version(){
        return "1.0.1";
    }

    public String appName(){
        return "New Mobile APP";
    }

    public UIComponent createUI(PlatformOS uiType){
        return GUIFactory.getFactory(uiType);
    }
}
