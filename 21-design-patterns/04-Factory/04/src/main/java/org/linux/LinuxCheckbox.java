package org.linux;

import org.interfaces.Checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mostrando um linux-style checkbox");
    }
}
