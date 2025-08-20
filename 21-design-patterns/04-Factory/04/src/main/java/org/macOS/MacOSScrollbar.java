package org.macOS;

import org.interfaces.Scrollbar;

public class MacOSScrollbar implements Scrollbar {
    @Override
    public void paint() {
        System.out.println("Mostrando uma macOS-style scrollbar");
    }
}
