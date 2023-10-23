package com.jatinder.creational.factory.abstractfactory;

import com.jatinder.creational.factory.abstractfactory.components.AndroidButton;
import com.jatinder.creational.factory.abstractfactory.components.Button;
import com.jatinder.creational.factory.abstractfactory.components.Dialog;
import com.jatinder.creational.factory.abstractfactory.components.Menu;

public class AndroidGUIComponent implements UIComponent {
    @Override
    public Button createButton() {
        return new AndroidButton();
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
