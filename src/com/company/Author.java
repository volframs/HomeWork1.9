package com.company;

public class Author {
    private final String name;
    private final String secondName;

    public Author(String name,String secondName){
        this.name=name;
        this.secondName=secondName;
    }

    public String getName(){
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
}
