package com.example.helloCamel.helloCamel.model;

import lombok.ToString;

@ToString
public class Client {
    private String name;
    private Integer idade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
