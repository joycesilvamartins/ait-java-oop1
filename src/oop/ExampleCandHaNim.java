package oop;

import java.util.Scanner;

public class ExampleCandHaNim {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput = "yes";

        while (userInput.equalsIgnoreCase("yes")) {
            int animalChoice = getAnimalChoice();
            String breed = getBreed(animalChoice);
            String gender = getGender();

            if (animalChoice == 1) {
                AnimalH horse = new AnimalH(breed, gender);
                System.out.println(horse);
            } else if (animalChoice == 2) {
                AnimalC cow = new AnimalC(breed, gender);
                System.out.println(cow);
            }
            System.out.println("Continue(yes/no:)");
            userInput = sc.next();
        }
    }

    public static int getAnimalChoice() {
        System.out.println("Please enter 1.(Horse) or 2.(Cow):");
        return sc.nextInt();

    }

    public static String getBreed(int animalChoice) {

        if (animalChoice == 1) {
            System.out.println("Shire or Arabian?");
        } else if (animalChoice == 2) {
            System.out.println("Angus or Jersey?");
        }
        return sc.next();
    }

    public static String getGender() {
        System.out.println("Please enter the gender(Male or Female)?");
        return sc.next();
    }

}
