package com.jfcorugedo.structural.bridge;

import lombok.Builder;

@Builder
public class Radio implements Device{

    public enum Status {
        ON, OFF
    }

    private Radio.Status status;
    private int volume;

    @Override
    public void disable() {
        this.status = Status.OFF;
    }

    @Override
    public void enable() {
        this.status = Status.ON;
    }

    @Override
    public void updateVolume(int diff) {
        this.volume = this.volume + diff;
    }

    @Override
    public boolean isEnabled() {
        return Status.ON.equals(this.status);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
