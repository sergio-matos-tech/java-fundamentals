package org.linux;

import org.factories.GUIFactory;
import org.interfaces.Button;
import org.interfaces.Checkbox;
import org.interfaces.Scrollbar;

public class LinuxFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new LinuxScrollbar();
    }
}
