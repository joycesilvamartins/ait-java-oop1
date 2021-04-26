package oop;

import java.util.Scanner;

public class BusDepot {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Bus b1 = new Bus();
        Bus b2 = new Bus("Michael", 60, "Volvo");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("The number of object created is: " + Bus.getCount());

        String driversName = getDriver();
        String theMake = getMake();
        int numberOfSeats = getSeats();

        Bus b3 = new Bus(driversName, numberOfSeats, theMake);
        System.out.println(b3);
        System.out.println("The number of object created is: " + Bus.getCount());

    }

    public static String getDriver() {
        System.out.print("Please enter the driver name: ");
        String name = sc.next();
        return name;
    }

    public static String getMake() {
        System.out.print("Please enter the make: ");
        return sc.next();
    }

    public static int getSeats() {
        System.out.print("Please enter the number of seats: ");
        return sc.nextInt();
    }
}
