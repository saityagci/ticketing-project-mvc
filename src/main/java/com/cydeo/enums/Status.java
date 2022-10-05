package com.cydeo.enums;

public enum Status {
    OPEN("Open"),IN_PROGRESS("In Progress"),COMPLETE("Complate");
    private final String value;
    private Status(String value){
        this.value=value;
    }
    public String gerValue(){
        return value;
    }
}
