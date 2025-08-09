package org.windows;

import org.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mostrando uma windows-style checkbox");
    }
}
