package org.windows;

import org.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mostrando uma windows-style button");
    }
}
