package org.cliente;

import org.factories.GUIFactory;
import org.interfaces.Button;
import org.interfaces.Checkbox;
import org.interfaces.Scrollbar;

public class Application {
    private final Button button;
    private final Checkbox checkbox;
    private final Scrollbar scrollbar;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        scrollbar = factory.createScrollbar();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
        scrollbar.paint();
    }
}
