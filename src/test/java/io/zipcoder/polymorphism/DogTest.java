package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest(){
        //Given
        Dog testDog = new Dog();
        String expected = "bark!";

        //when

        String actual = testDog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogNameTest(){
        //Given
        String dogName = "georgie";
        Dog testDog = new Dog(dogName);

        //When
        Dog expected = testDog;
        String actual = testDog.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setDogNameTest(){
        //Given
        String dogName = "zoey";
        Dog testDog = new Dog();

        //When
        String expected = "zoey";
        testDog.setName("zoey");
        String actual = testDog.getName();

        Assert.assertEquals(expected, actual);

    }


}
