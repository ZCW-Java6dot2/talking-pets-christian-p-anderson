package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Engine {

    public void runEngine(){
        int numPets = 0;
        String petName = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the pet show!\n");

        Boolean keepOn = true;

        while(keepOn){

            System.out.println("How many pets do you have?\n");
            numPets = scanner.nextInt();

            System.out.println("Please select the type of pet you have:\n"
                    + "\n1: Dog"
                    + "\n2: Cat"
                    + "\n3: Quokka"
                    + "\n4: Quit");

            Integer input = scanner.nextInt();

            switch(input){
                case 1:
                    System.out.println("What's your dog's name?");
                    petName = scanner.nextLine();
                    break;

                case 2:
                    System.out.println("What's your cat's name?");
                    petName = scanner.nextLine();
                    break;

                case 3:
                    System.out.println("What's your quokka's name?");
                    petName = scanner.nextLine();
                    break;
                case 4:
                    keepOn = false;
                    System.out.println("Turning off. Goodbye!");
                    break;
                default:
                    System.out.println("Please choose a number from the list.");
            }

        }



    }




}
