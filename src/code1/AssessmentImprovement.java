package code1;

import java.util.Scanner;

/*
 @author joyce
 */
public class AssessmentImprovement {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        boolean okToWatchFilm = admitToFilm(age);

        if (okToWatchFilm) {
            System.out.println("Enjoy the film!");
        } else {
            System.out.println("Sorry, you cannot watch this film.");
        }
    //    switchPrime();
    }

    public static boolean admitToFilm(int age) {
        if (age >= 15) {
            return true;
        } else {
            System.out.print("Is there an adult with you (true/false)? ");
            return sc.nextBoolean();
        }
    }

    public static void switchPrime() {

        System.out.print("Please enter a number in the range of (1...20): ");
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println(n + " is out of range 1...20.");
        } else {
            switch (n) {
                case 1:
                    System.out.println(n + " is a prime number.");
                    break;
                case 3:
                    System.out.println(n + " is a prime number.");
                    break;
                case 5:
                    System.out.println(n + " is a prime number.");
                    break;
                case 7:
                    System.out.println(n + " is a prime number.");
                    break;
                case 11:
                    System.out.println(n + " is a prime number.");
                    break;
                case 13:
                    System.out.println(n + " is a prime number.");
                    break;
                case 17:
                    System.out.println(n + " is a prime number.");
                    break;
                case 19:
                    System.out.println(n + " is a prime number.");
                    break;
                default:
                    System.out.println(n + " is not a prime number.");
            }
        }
    }
}
