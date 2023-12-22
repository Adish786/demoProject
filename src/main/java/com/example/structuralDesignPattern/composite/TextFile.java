package com.example.structuralDesignPattern.composite;

public class TextFile implements File {
    private Long size;

    public TextFile(Long size) {
        this.size = size;
    }
    @Override
    public String getType() {
        return "txt";
    }

    @Override
    public Long getSize() {
        return this.size;
    }
}
