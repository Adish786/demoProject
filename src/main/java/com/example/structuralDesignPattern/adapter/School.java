package com.example.structuralDesignPattern.adapter;

public class School {
    public static void main(String[] args) {

        Pen pp = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pp);
        aw.writeAssignment("I am bit tired to write Assignment");
    }
}
