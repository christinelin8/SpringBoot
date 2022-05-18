package com.example.helloWorld.demo.models;

public class pokemon {

    String name;
    String response;

    @Override
    public String toString() {
        return "pokemon{" +
                "name='" + name + '\'' +
                ", response='" + response + '\'' +
                '}';
    }

    public pokemon(String name, String response) {
        this.response = response;
        this.name = name;
    }

    public pokemon() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
