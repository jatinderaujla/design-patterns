package com.jatinder.creational.factory.abstractfactory;

import com.jatinder.creational.factory.abstractfactory.components.Button;
import com.jatinder.creational.factory.abstractfactory.components.Dialog;
import com.jatinder.creational.factory.abstractfactory.components.Menu;

public interface UIComponent {
    Button createButton();

    Dialog createDialog();

    Menu createMenu();
}
