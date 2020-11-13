package io.zipcoder.polymorphism;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this(null);
    }


    public String speak() {
        return "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
