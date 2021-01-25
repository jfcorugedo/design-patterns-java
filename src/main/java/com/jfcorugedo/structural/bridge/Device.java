package com.jfcorugedo.structural.bridge;

public interface Device {
    void disable();

    void enable();

    void updateVolume(int diff);

    boolean isEnabled();

    int getVolume();
}
