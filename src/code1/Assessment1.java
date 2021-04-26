package code1;

import java.util.Scanner;

/* @author Joyce Aparecida da Silva Martins*/
public class Assessment1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.print("Please enter your age: ");
//        int age = sc.nextInt();
//
//        boolean okToWatchFilm = admitToFilm(age);
//
//        if (okToWatchFilm) {
//            System.out.println("Enjoy the film!");
//        } else {
//            System.out.println("Sorry, you cannot watch this film.");
//        }
//     switchPrime();
        forStars();
    }

    public static boolean admitToFilm(int age) {
        if (age >= 15) {
            return true;
        } else {
            System.out.print("Is there an adult with you (true/false)? ");
            boolean adult = sc.nextBoolean();//improve - see Assessment Improvement
            return adult;
        }
    }

    public static void switchPrime() {

        System.out.print("Please enter a number in the range of (1...20): ");
        int n = sc.nextInt();

        switch (n) {//improve - see Assessment Improvement
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
            case 2:
                System.out.println(n + " is not a prime number.");
                break;
            case 4:
                System.out.println(n + " is not a prime number.");
                break;
            case 6:
                System.out.println(n + " is not a prime number.");
                break;
            case 8:
                System.out.println(n + " is not a prime number.");
                break;
            case 9:
                System.out.println(n + " is not a prime number.");
                break;
            case 10:
                System.out.println(n + " is not a prime number.");
                break;
            case 12:
                System.out.println(n + " is not a prime number.");
                break;
            case 14:
                System.out.println(n + " is not a prime number.");
                break;
            case 15:
                System.out.println(n + " is not a prime number.");
                break;
            case 16:
                System.out.println(n + " is not a prime number.");
                break;
            case 18:
                System.out.println(n + " is not a prime number.");
                break;
            case 20:
                System.out.println(n + " is not a prime number.");
                break;
            default:
                System.out.println(n + " is out of range 1...20.");
        }
    }

    public static void forStars() {

        System.out.print("How many stars? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
