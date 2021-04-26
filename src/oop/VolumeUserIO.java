package oop;

import oop.Volume;
import java.util.Scanner;
import static methods.MethodExercises.calcVolume;

// This class uses the Volume class which was already 
// in package oop. Volume has package access and thus
// VolumeUserIO has no issue accessing it.
public class VolumeUserIO {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // hardcoded values
        Volume v = new Volume(2, 3, 4);
        int volume = calcVolume();
        System.out.println("The Volume is: " + volume);

        //values from the user
        int length = getLength();
        int width = getWidth();
        int height = getHeight();

        Volume v2 = new Volume(length, width, height);
        volume = v2.calcVolume();
        System.out.println("The volume is " + volume);
    }//end of main

    public static int getLength() {
        System.out.print("Please enter the lenght: ");
        return sc.nextInt();
    }

    public static int getWidth() {
        System.out.print("Please enter the lenght: ");
        return sc.nextInt();
    }

    public static int getHeight() {
        System.out.print("Please enter the height: ");
        return sc.nextInt();
    }
}//end of class
