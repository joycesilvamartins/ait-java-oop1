
package ie.ait.java;

// Java uses BLOCK scope - curly braces {} are VERY

import java.util.Scanner;

// IMPORTANT!!!
public class Scope {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a=1;
        
        a=2;
        
        {
            a=3;
            int b=0;
            b++;
            {
                b++;
            }
        }
//        b++;
        
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        
        int sum = add(a,b);
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
        
    }
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
        
    }
}
