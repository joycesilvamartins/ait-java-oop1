package ie.ait.java;

import java.util.Scanner;

public class Circle {
    
      static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double diameter = calcDiameter(radius);
        System.out.println("diameter is "+diameter);

        double circumference = calcCircumference(radius);
        System.out.println("circumference is "+circumference);

        double area = calcArea(radius);
        System.out.println("area is "+area);
    }
    
    public static double calcDiameter(double radius){
        return radius * 2;
    }
    public static double calcCircumference(double radius){
        return Math.PI * (radius * 2);
    }

    public static double calcArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}

