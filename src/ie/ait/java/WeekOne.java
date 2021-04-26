package ie.ait.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekOne {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("in main");
        boolean actAlone = didOswaldActAlone();
        System.out.println(actAlone);

//        int sum = addNumbers(5,8);
//        System.out.println(sum);
        
        String favFilm = favouriteFilm();         
        int rating = filmRating(favFilm);
        System.out.println("Your favourite film is "+favFilm+ ". Its rating is "+rating);
    }
    
    public static int addNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    
    
    public static boolean didOswaldActAlone(){
        System.out.print("Did Oswald act alone? ");
        boolean actAlone = sc.nextBoolean();
        return actAlone;
    }
    
    public static String favouriteFilm(){
        System.out.print("What is your favourite film? ");
        String favFilm = sc.next();
        return favFilm;
    }
    
    public static int filmRating(String favFilm){
        System.out.print("Enter the rating for " + favFilm);
        int rating = sc.nextInt();
        return rating;
    }

}
