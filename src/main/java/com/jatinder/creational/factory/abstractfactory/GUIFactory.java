package com.jatinder.creational.factory.abstractfactory;

public class GUIFactory {
    public static UIComponent getFactory(PlatformOS platformOS){
        if(PlatformOS.ANDROID.equals(platformOS))
            return new AndroidGUIComponent();
        else if(PlatformOS.IOS.equals(platformOS))
            return new IosGUIComponent();
        return null;
    }
}
