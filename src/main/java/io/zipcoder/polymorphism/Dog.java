package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(){
        this(null);
    }

    public Dog(String name){
        super(name);

    }

    @Override
    public String speak() {
    return "bark!";
    }

}
