package com.jfcorugedo.structural.adapter;

import lombok.Builder;

@Builder
public class Email {

    private String localPart;
    private String domain;

    public String toString() {
        return String.format("%s@%s", localPart, domain);
    }
}
