package org.factories;

import org.interfaces.Button;
import org.interfaces.Checkbox;
import org.interfaces.Scrollbar;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    Scrollbar createScrollbar();
}
