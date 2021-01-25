package com.jfcorugedo.structural.bridge;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TV implements Device {

    private boolean enabled;
    private int volume;

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void updateVolume(int diff) {
        int newVolume = this.volume + diff;
        if(newVolume >= 0) {
            this.volume = newVolume;
        } else {
            this.volume = 0;
        }
    }
}
