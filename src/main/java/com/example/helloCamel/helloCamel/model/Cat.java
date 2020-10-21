package com.example.helloCamel.helloCamel.model;

import lombok.ToString;

@ToString
public class Cat {
    Cat(){}

    private String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
