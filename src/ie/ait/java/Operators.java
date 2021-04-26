
package ie.ait.java;

import java.util.Scanner;

public class Operators { static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Enter x: ");
//        int x = sc.nextInt();
//        System.out.print("Enter y: ");
//        int y = sc.nextInt();

        //logicalOps(x,y);
        //simpleMaths(x,y);
//        boolean mod = modulus(x,y);
//        System.out.println(mod);
        incrDecr();

    }

    public static void incrDecr() {
        int x=0, w = 0   , y = 0 , z = 0;
        x = 4;
        /*
        5
        5
        6
        5
        5
        4
        false
        true
        true
        */
        System.out.println(++x);//5
        System.out.println(x++);//5
        System.out.println(x);//6
        System.out.println(--x);//5
        System.out.println(x--);//5
        System.out.println(x);//4

        w = 20;
        x = 10;
        y = -5;
        z = 0;
        System.out.println(w == x && y != z);
        System.out.println(w == x || y != z);
        System.out.println(!(w == (x + z)));

    }

    public static boolean modulus(int x, int y) {
        if (x % y == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void logicalOps(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("both numbers are positive");
        } else if (x < 0 && y < 0) {
            System.out.println("both numbers are negative");
        } else if (x == 0 || y == 0) {
            System.out.println("one of the numbers is 0");
        } else if (x < 0 || y < 0) {
            System.out.println("one of the numbers is negative");
        }
    }

    public static void simpleMaths(int x, int y) {
        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + sum);
        int difference = x - y;
        System.out.println("The difference of " + x + " and " + y + " is " + difference);
        int product = x * y;
        System.out.println("The product of " + x + " and " + y + " is " + product);
        int quotient = x / y;
        System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
    }

}
