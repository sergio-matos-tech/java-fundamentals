package org.windows;

import org.factories.GUIFactory;
import org.interfaces.Button;
import org.interfaces.Checkbox;
import org.interfaces.Scrollbar;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new WindowsScrollbar();
    }
}
