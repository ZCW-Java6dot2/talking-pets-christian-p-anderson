package io.zipcoder.polymorphism;

public class Quokka extends Pet {


    public Quokka(){
        this(null);
    }

    public Quokka(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "squeak!";
    }

}
