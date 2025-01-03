package com.example.cyr_latin.converter.dto;

public class ConverterResponse {

    private String text;

    public ConverterResponse(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
