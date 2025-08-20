package org.linux;

import org.interfaces.Button;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mostrando um linux-style button");
    }
}
