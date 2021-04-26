package methods;

import java.awt.BorderLayout;
import java.util.Scanner;

public class MethodExercises {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// START THE MAIN

//        //Ex.1
//        System.out.print("Please enter the value of X: ");
//        int x = sc.nextInt();
//
//        System.out.print("Please enter the value of Y: ");
//        int y = sc.nextInt();
//
//        int sum = calculateSum(x, y);//1.c
//        System.out.println("The sum of " + x + " and " + y + " is " + sum);
//
//        int product = calculateProduct(x, y);//1.e
//        System.out.println("The product of " + x + " and " + y + " is " + product);
//
//        int difference = calculateDifference(x, y);//1.g
//        System.out.println("The difference of " + x + " and " + y + " is " + difference);
//
//        int quotient = calculateQuotient(x, y);//1.h
//        System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
//        //Ex.2
//        System.out.print("Please enter the value of lenght: ");
//        int l = sc.nextInt();
//
//        System.out.print("Please enter the value of width: ");
//        int w = sc.nextInt();
//
//        System.out.print("Please enter the value of height: ");
//        int h = sc.nextInt();
//
//        int volume = calcVolume(length, weidth, height);
//        System.out.println("The volume is: " + volume);
//          int volume = calcVolume();//2b
//          System.out.println("The volum is: " + volume);
        //Ex.3
//        carPark();
//        //Ex.4
        //coordGeometry();
        //Ex.5
//        System.out.print("Please enter opposite side: ");
//        double opposite = sc.nextDouble();
//
//        System.out.print("Please enter adjacent side: ");
//        double adjacent = sc.nextDouble();
//
//        double h = calcHypotenuse(opposite, adjacent);
//        System.out.println("The length of the hypotenuse is: " + h);
        //Ex.6
//        System.out.print("Please enter the base: ");
//        int base = sc.nextInt();
//
//        System.out.print("Please enter the exponent: ");
//        int exp = sc.nextInt();
//
//        System.out.println(base + " to the power of " + exp + " is " + intPower(base, exp));
        //Ex.7
//        System.out.print("Please enter the number of values to be processed: ");
//        int n = sc.nextInt();
//
//        int sum = sumTheValues(n);
//
//        System.out.println("The sum of the " + n + " values entered is: " + sum);
        //Ex.8
//        System.out.println("The square of integer 7 is: " + square(7));
//        System.out.println("The square of double 7.5 is " + square(7.5));
        //Ex.9
        MethodExercises me = new MethodExercises();

        int sum = me.addNumbers(2, 3);
        System.out.println("The sum is: " + sum);
        // calling a static method using a object
        int volume = me.calcVolume(2, 3, 4);
        System.out.println("The volume is: " + volume);
        //calling a static method using a class
        int volumeC = MethodExercises.calcVolume(2, 3, 4);
        System.out.println("The volume is: " + volumeC);

    }// END OF MAIN

    public static int calculateSum(int x, int y) {//1.c

        int sum = x + y;
        return sum;

    }

    public static int calculateProduct(int x, int y) {//1.e

        int product = x * y;
        return product;
    }

    public static int calculateDifference(int x, int y) {//1.g

        int difference = x - y;
        return difference;

    }

    public static int calculateQuotient(int x, int y) {//1.h

        int quotient = x / y;
        return quotient;

    }

    public static int calcVolume(int l, int w, int h) {//2.

        int volume = l * w * h;
        return volume;

    }

    public static int calcVolume() {
        System.out.print("Please enter the value of lenght: ");
        int l = sc.nextInt();

        System.out.print("Please enter the value of width: ");
        int w = sc.nextInt();

        System.out.print("Please enter the value of height: ");
        int h = sc.nextInt();

        return l * w * h;

    }

    public static void carPark() {//3.
        double parkTime = 0;
        double charge = 0;

        System.out.println("How many cars? ");
        int numOfCar = sc.nextInt();

        for (int car = 1; car <= numOfCar; car++) {
            System.out.println("How many hours was the car parked for? ");
            parkTime = sc.nextDouble();
            charge = calculateCharges(parkTime);

            System.out.println("Car # " + car + " was parked for " + parkTime + " hour(s), and charged " + charge + " Euro.");

        }

    }

    public static double calculateCharges(double parkTime) {

        double totalCharge;

        final int MIN_CHARGE = 0, MAX_CHARGE = 21;
        final int MIN_TIME = 1, MAX_TIME = 8, HOURLY_FEE = 3;
        double extraTime = 0, extraCharge = 0;
        totalCharge = 0;

        if (parkTime < MIN_TIME) {
            totalCharge = MIN_CHARGE;
        } else if (parkTime > MAX_TIME) {
            totalCharge = MAX_CHARGE;
        } else {
            extraTime = Math.ceil(parkTime - MIN_TIME);
            System.out.println("Extra time == " + extraTime);
            extraCharge = extraTime * HOURLY_FEE;
            totalCharge = MIN_CHARGE + extraCharge;

        }
        return totalCharge;
    }

    public static void coordGeometry() {//Ex.4
        //declare variables
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double d = 0, m = 0, midX = 0, midY = 0;
        //get the coordinates
        System.out.print("Please enter x1:");
        x1 = sc.nextDouble();

        System.out.print("Please enter y1: ");
        y1 = sc.nextDouble();

        System.out.print("Please enter x2: ");
        x2 = sc.nextDouble();

        System.out.print("Please enter y2: ");
        y2 = sc.nextDouble();

        //calculate the distance
        d = calcDistance(x1, y1, x2, y2);
        System.out.println("Distance between the two points is: " + d);
        //calculate the midpoint
        midX = calcMidPoint(x1, x2);
        midY = calcMidPoint(y1, y2);
        System.out.println("Coordinates of the midpoint are: " + midX + "," + midY);

        //calculate the slope
        if (x1 == x2) {
            System.out.println("The slope is undefined as the x coordinates are equal.");
        } else {
            m = calcSlope(x1, y1, x2, y2);
            System.out.println("The slope is: " + m);
        }

    }

    public static double calcDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    public static double calcMidPoint(double p1, double p2) {

        return ((p1 + p2) / 2);

    }

    public static double calcSlope(double x1, double y1, double x2, double y2) {

        return ((y2 - y1) / (x2 - x1));

    }

    public static double calcHypotenuse(double opposite, double adjacent) {

        return Math.sqrt(Math.pow(adjacent, 2) + Math.pow(opposite, 2));

    }

    public static int intPower(int base, int exponent) {//Ex.6

        int total = 1;

        for (int i = 1; i <= exponent; i++) {
            total *= base;

        }
        return total;

        // return (int) Math.pow(base, exponent);
    }

    public static int sumTheValues(int howManyNumbers) {//Ex.7

        int total = 0;
        int value = 0;

        for (int i = 1; i <= howManyNumbers; i++) {

            System.out.println("Please enter a value: ");
            value = sc.nextInt();
            total += value;

        }

        return total;

    }

    public static int square(int param) {//Ex.8
        return param * param;

    }

    public static double square(double param) {
        return param * param;

    }

    public int addNumbers(int n1, int n2) {//Ex.9

        return n1 + n2;

    }

}
