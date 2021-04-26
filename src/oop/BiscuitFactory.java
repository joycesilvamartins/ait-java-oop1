package oop;

import java.util.Scanner;

public class BiscuitFactory {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1.
        Biscuit biscuit1 = new Biscuit();
        //2.
        biscuit1.setCompany("Mc Vities");
        biscuit1.setTypeOfBiscuit("Digestive");
        biscuit1.setNumberOfBiscuit(20);
        biscuit1.setLocation("Manchester");
        System.out.println(biscuit1);
        //3. Biscuit(String aTypeOfBiscuit, String aCompany, int aNumberOfBiscuit)
        Biscuit biscuit2 = new Biscuit("Kimberleys", "Mikado", 30, "Dublin");
        System.out.println(biscuit2);
        //4.
        String company = getCompany();
        String type = getTypeOfBiscuit();
        int number = getNumBiscuits();
        //5.
        BiscuitFactory bf = new BiscuitFactory();
        String location = bf.getLocation();
        Biscuit biscuit3 = new Biscuit(type, company, number, location);
        System.out.println(biscuit3);

    }

    public static String getTypeOfBiscuit() {
        System.out.println("Please enter the type of biscuit: ");
        return sc.next();

    }

    public static String getCompany() {
        System.out.println("Please enter the name of company: ");
        return sc.next();
    }

    public static int getNumBiscuits() {//class methods
        System.out.println("Please enter the number of biscuits: ");
        return sc.nextInt();
    }

    public String getLocation() {//instance methods
        System.out.println("Please enter the location: ");
        return sc.next();

    }

}
