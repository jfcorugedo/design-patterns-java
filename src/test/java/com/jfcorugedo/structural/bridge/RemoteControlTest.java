package com.jfcorugedo.structural.bridge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoteControlTest {

    @Test
    public void turnOnDevice() {

        Device device = Device.builder().enabled(false).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.togglePower();

        assertThat(device.isEnabled()).isTrue();
    }

    @Test
    public void turnOffDevice() {

        Device device = Device.builder().enabled(true).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.togglePower();

        assertThat(device.isEnabled()).isFalse();
    }
}
