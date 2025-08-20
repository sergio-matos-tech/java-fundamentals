package org.macOS;

import org.interfaces.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mostrando uma macOS-style checkbox");
    }
}
