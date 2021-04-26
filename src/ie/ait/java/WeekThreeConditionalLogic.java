package ie.ait.java;

import java.util.Scanner;

enum Direction {

    NORTH, SOUTH, EAST, WEST
}

public class WeekThreeConditionalLogic {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// start main method

//Ex.01		preAndPostDifference();
//Ex.02		booleanLogicShortCircuitOps();
//Ex.03		booleanBitWiseOps();
//Ex.04		compareStrings();
//Ex.05 	System.out.print("Please enter the certification for a film: ");
//		int certFilm = sc.nextInt();
////		System.out.print("Please enter the age of the person: ");
//		int age = sc.nextInt();
//              boolean okToWatchFilm = admitToFilm(certFilm, age);
//              System.out.println(okToWatchFilm);
//Ex.06         ternaryOperator();
//Ex.07		 switchVowelOrConsonant();
//Ex.08		 ifMonth();
//Ex.09		 ifGrade();
//Ex.10		 switchMathOperation();
//Ex.11         switchEnumType();
//Ex.12         ifTemperature();
/*Ex.13*/ switchDaysInMonth();
    }//end main method

    public static void preAndPostDifference() {//Ex.01

        int x = 5;
        int y = 10;

        System.out.println("The value of X is: " + x);
        System.out.println("The value of ++X is: " + ++x);
        System.out.println("The value of X++ is: " + x++);
        System.out.println("The value of X is: " + x);

        System.out.println("The value of Y is: " + y);
        System.out.println("The value of --Y is: " + --y);
        System.out.println("The value of Y-- is: " + y--);
        System.out.println("The value of Y is: " + y);

    }

    public static void booleanLogicShortCircuitOps() {//Ex.02

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 < 0 && num2++ < 0) {
            System.out.println("The value of number 2 is: " + num2);
        } else if (num1 > 0 && num2++ > 0) {
            System.out.println("The value of number 2 is: " + num2);
        } else if (num1 == 0 || num2++ == 0) {
            System.out.println("The value of number 2 is: " + num2);
        } else if (num1 < 0 || num2++ < 0) {
            System.out.println("The value of number 2 is: " + num2);

        }
        System.out.println("The value of number 2 is: " + num2);
    }

    public static void booleanBitWiseOps() {//Ex.03 - Non-short circuit break (& , |)

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 < 0 & num2++ < 0) {
            System.out.println("The value of number 2 is: " + num2);
        } else if (num1 > 0 & num2++ > 0) {
            System.out.println("The value of number 2 is: " + num2);
        } else if (num1 == 0 | num2++ == 0) {
            System.out.println("The value of number 2 is: " + num2);
        } else if (num1 < 0 | num2++ < 0) {
            System.out.println("The value of number 2 is: " + num2);

        }
        System.out.println("The value of number 2 is: " + num2);
    }

    public static void compareStrings() {//Ex.04

        System.out.print("Please enter the first String: ");
        String s1 = sc.next();

        System.out.print("Please enter the second String: ");
        String s2 = sc.next();

        System.out.println("Using == returns: " + (s1 == s2));

        System.out.println("Using equals() returns: " + s1.equals(s2));

        String name1 = "Sean";
        String name2 = "Sean";

        System.out.println(name1 == name2);

        String name3 = "John";
        String name4 = new String("John");

        System.out.println(name3 == name4);
    }

    public static boolean admitToFilm(int certFilm, int age) {//Ex.05

        // if (age > certFilm) {
        // return true;
        // }
        // return false;
        // ternary operator
        boolean isAgeOk = age >= certFilm ? true : false;
        return isAgeOk;

    }

    public static void ternaryOperator() {//Ex.06
        boolean isHappy = true;

        String mood = isHappy ? "I am happy!" : "I am not happy!";

        System.out.print("Please enter a value for X: ");
        int x = sc.nextInt();

        System.out.print("Please enter a value for Y: ");
        int y = sc.nextInt();

        int minVal = x < y ? x : y;
        System.out.println("The min value is: " + minVal);

    }

    public static void switchVowelOrConsonant() {//Ex.07
        System.out.print("Please enter a character: ");
        char letter = sc.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(letter + " is a vowel!");
                break;
            default:
                System.out.println(letter + " is a consonant!");

        }

    }

    public static void ifMonth() {//Ex.08
        final int JAN = 1, FEB = 2, MAR = 3;
        final int APR = 4, MAY = 5, JUN = 6;

        try {
            System.out.print("Please enter a month in the range 1 to 12: ");
            int month = sc.nextInt();

            if (month == JAN) {
                System.out.println("January");
            } else if (month == FEB) {
                System.out.println("February");
            } else if (month == MAR) {
                System.out.println("March");
            } else if (month == APR) {
                System.out.println("April");
            } else if (month == MAY) {
                System.out.println("May");
            } else if (month == JUN) {
                System.out.println("June");
            } else {
                System.out.println("The month is out of range.");
            }
        } catch (Exception ex) {
            System.out.println("Exeception caught.");
            ex.printStackTrace();

        }

    }

    public static void ifGrade() {//Ex.09
        System.out.print("Please enter a mark in the range 0 to 100: ");
        double mark = sc.nextDouble();

        try {
            if (mark < 0 || mark > 100) {
                System.out.println("Error...Mark is out of range!");
            } else if (mark >= 70 && mark <= 100) {
                System.out.println("A");
            } else if (mark >= 60 && mark <= 69) {
                System.out.println("B");
            } else if (mark >= 50 && mark <= 59) {
                System.out.println("C");
            } else if (mark >= 40 && mark <= 49) {
                System.out.println("D");
            } else {
                System.out.println("Fail");

            }
        } catch (Exception ex) {
            System.out.println("Exception caught!");
            ex.printStackTrace();

        }
    }

    public static void switchMathOperation() {//Ex.10
        double answer = 0.0;
        boolean charOk = true;

        System.out.print("Please enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Please enter a character: ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.println("Unknown mathematical operator: " + operation);
                charOk = false;
                break;

        }
        if (charOk) {
            System.out.println(answer);
        }
    }

    public static void switchEnumType() {//Ex.11
        Direction theWay = null;

        System.out.print("Please enter a string to represente the direction (N,S,E or W): ");
        String directionWay = sc.next().toUpperCase();

        switch (directionWay) {
            case "N":
                theWay = Direction.NORTH;
                break;
            case "S":
                theWay = Direction.SOUTH;
                break;
            case "E":
                theWay = Direction.EAST;
                break;
            case "W":
                theWay = Direction.WEST;
                break;
            default:
                System.out.println("Is not recognised!");
        }
        switch (theWay) {
            case NORTH:
                System.out.println("Santy");
                break;
            case SOUTH:
                System.out.println("Penguins");
                break;
            case EAST:
                System.out.println("The land of the rising sun...");
                break;
            case WEST:
                System.out.println("Hollywood...");
            default:

        }
    }

    public static void ifTemperature() {//Ex.12

        int temperature = 0;

        final int COLD = 0, MILD = 15, WARM = 20;
        final int VERY_WARM = 25, HOT = 30;

        try {
            System.out.print("Please enter a temperature: ");
            temperature = sc.nextInt();

            if (temperature <= COLD) {
                System.out.println("Cold");
            } else if (temperature < COLD && temperature < MILD) {
                System.out.println("A little cold but OK");
            } else if (temperature == MILD && temperature < WARM) {
                System.out.println("Mild");
            } else if (temperature == WARM && temperature < VERY_WARM) {
                System.out.println("Warm");
            } else if (temperature == VERY_WARM && temperature < VERY_WARM) {
                System.out.println("Very Warm");
            } else if (temperature >= HOT) {
                System.out.println("Hot");
            }

        } catch (Exception ex) {
            System.out.println("Exception caught!");
            ex.printStackTrace();

        }
    }

    public static void switchDaysInMonth() {//Ex.13

        System.out.print("Please enter a month 1 to 12: ");
        int month = sc.nextInt();

        int numDays = 0;

        final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6;
        final int JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;

        switch (month) {
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                numDays = 31;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                numDays = 30;
                break;
            case FEB:
                System.out.print("Please enter a year: ");
                int year = sc.nextInt();

                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    numDays = 29;
                    System.out.println("This is a leap year!");
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month!" + month);

        }
        System.out.println("Number of days is: " + numDays);
    }

}// end of a class

