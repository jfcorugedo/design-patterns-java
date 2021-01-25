package com.jfcorugedo.structural.bridge;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Device {

    private boolean enabled;
    private int volume;

    public void disable() {
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    public void updateVolume(int diff) {
        this.volume = this.volume + diff;
    }
}
