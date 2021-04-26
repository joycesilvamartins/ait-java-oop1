package oop;

import java.util.Scanner;

public class ShowRoom {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1.
        Car Ford = new Car();
        //2.
        Ford.setMake("Ford");
        Ford.setModel("Modeo");
        Ford.setColour("Black");
        Ford.setAutomatic(true);
        Ford.setEngineSize(1.6);
        System.out.println(Ford);
        //3.
        Car VW = new Car("VW", "Passa", 2.0, false, "Silver");//hardcoding values
        System.out.println(VW);
        //4.
        System.out.println("The number of object created is:" + Car.getCount());
        //5. user input
        String makeOfCar = getMake();
        //System.out.println(makeOfCar);
        String model = getModel();
        double engineSize = getEngineSize();
        String colour = getColour();
        boolean automatic = isAutomatic();

        Car usersCar = new Car(makeOfCar, model, engineSize, automatic, colour);
        System.out.println(usersCar);
        
        //6. Done above
        //7. Done above
    }// end of main

    public static String getMake() {
        System.out.println("Please enter the make of car: ");
        return sc.next();
    }

    public static String getModel() {
        System.out.println("Please enter the model of car: ");
        return sc.next();
    }

    public static double getEngineSize() {
        System.out.println("Please enter the engine size of car: ");
        return sc.nextDouble();
    }

    public static String getColour() {
        System.out.println("Please enter the colour of car: ");
        return sc.next();
    }

    public static boolean isAutomatic() {
        System.out.println("Is it automatic: ");
        return sc.nextBoolean();
    }

}
