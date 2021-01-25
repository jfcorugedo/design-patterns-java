package com.jfcorugedo.structural.bridge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoteControlTest {

    @Test
    public void turnOn() {

        Device device = TV.builder().enabled(false).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.togglePower();

        assertThat(device.isEnabled()).isTrue();
    }

    @Test
    public void turnOff() {

        Device device = TV.builder().enabled(true).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.togglePower();

        assertThat(device.isEnabled()).isFalse();
    }

    @Test
    public void volumeDown() {

        Device device = TV.builder().volume(50).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.volumeDown();

        assertThat(device.getVolume()).isEqualTo(45);
    }

    @Test
    public void volumeCanNeverBeNegative() {

        Device device = TV.builder().volume(0).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.volumeDown();

        assertThat(device.getVolume()).isEqualTo(0);
    }

    @Test
    public void volumeUp() {

        Device device = TV.builder().volume(50).build();
        RemoteControl remoteControl = RemoteControl.newInstance(device);

        remoteControl.volumeUp();

        assertThat(device.getVolume()).isEqualTo(55);
    }
}
