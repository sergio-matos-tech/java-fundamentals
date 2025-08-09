package org.macOS;

import org.interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mostrando um macOS-style button");
    }
}
