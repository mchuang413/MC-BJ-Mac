package com.example.bluejextension;

import bluej.extensions2.*;

public class MyBlueJExtension extends Extension {
    @Override
    public void startup(BlueJ bluej) {
        System.out.println("MyBlueJExtension: Extension loaded successfully!");
    }

    @Override
    public boolean isCompatible() {
        System.out.println("MyBlueJExtension: Checking compatibility...");
        return true;
    }

    @Override
    public String getName() {
        return "My BlueJ Extension";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }
}
