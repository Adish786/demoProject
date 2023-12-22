package com.example.structuralDesignPattern.composite;

public class CompositeDesinge {

    public static void main(String[] args) {
        TextFile chile1 = new TextFile(100L);
        TextFile child2 = new TextFile(200L);
        Directory root = new Directory(100L);
        root.addFile(chile1);
        root.addFile(child2);
        System.out.println(chile1.getSize());
        System.out.println(root.getSize());

    }
}
