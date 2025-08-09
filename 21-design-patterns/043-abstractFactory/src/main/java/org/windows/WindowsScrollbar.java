package org.windows;

import org.interfaces.Scrollbar;

public class WindowsScrollbar implements Scrollbar {
    @Override
    public void paint() {
        System.out.println("Mostrando uma Windows-style scroll bar");
    }
}
