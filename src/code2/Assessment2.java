package code2;

import java.util.Scanner;

class Cow {

    private String theBreed;
    private String theGender;

    Cow(String aBreed, String aGender) {
        theBreed = aBreed;
        theGender = aGender;
    }

    @Override
    public String toString() {
        return "Cow{breed= " + theBreed + ", gender= " + theGender + "}";
    }

    public String getBreed() {
        return theBreed;
    }

    public void setBreed(String aBreed) {
        theBreed = aBreed;
    }

    public String getGender() {
        return theGender;
    }

    public void setGender(String aGender) {
        theGender = aGender;
    }
}

class Horse {

    private String theBreed;
    private String theGender;

    Horse(String aBreed, String aGender) {
        theBreed = aBreed;
        theGender = aGender;
    }

    @Override
    public String toString() {
        return "Horse{breed= " + theBreed + ", gender= " + theGender + "}";
    }

    public String getBreed() {
        return theBreed;
    }

    public void setBreed(String aBreed) {
        theBreed = aBreed;
    }

    public String getGender() {
        return theGender;
    }

    public void setGender(String aGender) {
        theGender = aGender;
    }
}


class AssessmentNew2 {

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
