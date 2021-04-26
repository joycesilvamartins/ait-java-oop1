package oop;

import java.util.Scanner;

public class PhoneUserIO {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String cont = "y";

        while (cont.equalsIgnoreCase("y")) {
            // create the object
            Phone p1 = new Phone(getPhoneNumber(), getOwner(), getPrice());
            System.out.println(p1);

            System.out.println("Continue (y/n)");
            cont = sc.next();
        }
        //output the number of phones created
        System.out.println("The number of objects created is " + Phone.getCount());
    }

    public static String getPhoneNumber() {

        System.out.print("Please enter a phone number: ");
        String number = sc.next();
        return number;

    }

    public static String getOwner() {

        System.out.print("Please enter a owner name: ");
        String name = sc.next();
        return name;

    }

    public static double getPrice() {

        System.out.print("Please enter the price: ");
        double price = sc.nextDouble();
        return price;

    }

}
