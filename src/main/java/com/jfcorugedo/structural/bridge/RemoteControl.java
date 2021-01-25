package com.jfcorugedo.structural.bridge;

public class RemoteControl {

    private Device device;

    private RemoteControl(Device device) {
        this.device = device;
    }

    public static RemoteControl newInstance(Device device) { return new RemoteControl(device); }

    public void togglePower() {
        if(this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    public void volumeDown() {
        this.device.updateVolume(-5);
    }

    public void volumeUp() {
        this.device.updateVolume(5);
    }
}
