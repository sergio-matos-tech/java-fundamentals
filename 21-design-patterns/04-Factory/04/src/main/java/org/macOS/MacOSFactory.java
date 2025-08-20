package org.macOS;

import org.factories.GUIFactory;
import org.interfaces.Button;
import org.interfaces.Checkbox;
import org.interfaces.Scrollbar;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MacOSScrollbar();
    }
}
