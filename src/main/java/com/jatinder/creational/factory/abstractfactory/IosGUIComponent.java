package com.jatinder.creational.factory.abstractfactory;


import com.jatinder.creational.factory.abstractfactory.components.Button;
import com.jatinder.creational.factory.abstractfactory.components.Dialog;
import com.jatinder.creational.factory.abstractfactory.components.IosButton;
import com.jatinder.creational.factory.abstractfactory.components.Menu;

public class IosGUIComponent implements UIComponent {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dialog createDialog() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
