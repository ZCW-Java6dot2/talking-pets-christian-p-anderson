package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class QuokkaTest {


        @Test
        public void speakTest(){
            //Given
            Quokka testQuokka = new Quokka();
            String expected = "squeak!";

            //when

            String actual = testQuokka.speak();

            Assert.assertEquals(expected, actual);

        }

        @Test
        public void getQuokkaNameTest(){
            //Given
            String quokkaName = "binx";
            Quokka testQuokka = new Quokka(quokkaName);

            //When
            String expected = quokkaName;
            String actual = testQuokka.getName();

            Assert.assertEquals(expected, actual);

        }

        @Test
        public void setQuokkaNameTest(){
            //Given
            String dogName = "portabella";
            Quokka testQuokka = new Quokka();

            //When
            String expected = "portabella";
            testQuokka.setName("portabella");
            String actual = testQuokka.getName();

            Assert.assertEquals(expected, actual);

        }


}
