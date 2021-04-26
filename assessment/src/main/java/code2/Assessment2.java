package code2;

import java.util.Scanner;

public class Assessment2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String userInput = "yes";

        while (userInput.equalsIgnoreCase("yes")) {

            int animalChoice = getAnimalChoice();
            String breed = getBreed(animalChoice);
            String gender = getGender();

            if (animalChoice == 1) {
                Horse horse = new Horse(breed, gender);
                System.out.println(horse);
            } else if (animalChoice == 2) {
                Cow cow = new Cow(breed, gender);
                System.out.println(cow);
            }
            System.out.print("Continue [yes or no]: ");
            userInput = sc.next();
        }
    }

    public static int getAnimalChoice() {

        System.out.print("Please enter [1.Horse or 2.Cow]: ");
        return sc.nextInt();
    }

    public static String getBreed(int animalChoice) {

        if (animalChoice == 1) {
            System.out.print("Shire ir Arabian? ");
        } else if (animalChoice == 2) {
            System.out.print("Angus or Jersey? ");
        }
        return sc.next();
    }

    public static String getGender() {

        System.out.print("Please enter a gender [Male or Female]: ");
        return sc.next();
    }
}
