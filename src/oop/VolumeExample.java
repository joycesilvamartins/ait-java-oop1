package oop;

import oop.Volume;

public class VolumeExample {

    public static void main(String[] args) {
        Volume v = new Volume(2, 3, 4);
        Volume v1 = new Volume(2, 2, 2);
        //System.out.println("v is "+v.toString()); 
        System.out.println("v is " + v); // toString - L=2,W=3,H=4
//        String s = v.toString();
//        System.out.println(s);

        int volume = v.calcVolume();
        System.out.println("The volume is: " + volume);

        volume = v1.calcVolume();
        System.out.println("The volume is: " + volume);

        System.out.println("The lenght is " + v.getLenght());
        System.out.println("The height is " + v.getHeight());
        System.out.println("The width is " + v.getWidth());

        v.setLenght(5);
        v.setHeight(4);
        v.setWidth(8);
        volume = v.calcVolume();
        System.out.println("The volume is: " + volume);//160

        Volume v2 = new Volume();
        volume = v2.calcVolume();
        System.out.println("The volume is: " + volume);//0

        Volume v3 = new Volume(8, 6, 4);
        volume = v3.calcVolume();
        System.out.println("The volume is: " + volume);//192

        v3.setLenght(2);
        v3.setWidth(6);
        v3.setHeight(10);
        volume = v3.calcVolume();
        System.out.println("The volume is: " + volume);//120

    }//end of main

}//end of class
