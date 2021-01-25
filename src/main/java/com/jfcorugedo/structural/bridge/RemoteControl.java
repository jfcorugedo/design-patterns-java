package com.jfcorugedo.structural.bridge;

public class RemoteControl {

    private Device device;

    private RemoteControl(Device device) {
        this.device = device;
    }

    public static final RemoteControl newInstance(Device device) { return new RemoteControl(device); }

    public void togglePower() {

    }
}
