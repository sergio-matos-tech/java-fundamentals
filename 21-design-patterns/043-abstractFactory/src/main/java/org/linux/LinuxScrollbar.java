package org.linux;

import org.interfaces.Scrollbar;

public class LinuxScrollbar implements Scrollbar {
    @Override
    public void paint() {
        System.out.println("Mostrando um linux-style scrollbar");
    }
}
