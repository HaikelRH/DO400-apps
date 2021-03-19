package com.redhat.training.home.automation;

public class LightSystem {
    private boolean on = false;

    public void switchOn() {
        on = true;
    }

    public boolean isOn() {
        return on;
    }
}
