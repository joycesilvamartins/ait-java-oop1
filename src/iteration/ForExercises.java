package iteration;

import java.util.Scanner;

public class ForExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //forHeaderTesting();
        //forSmallestLargest();
        forHistogram();
        //forAverage();
        //forSequence();
        //forSumEvenNumbers();
//        //extra
//        System.out.println("in main");
//        int total = 0;
//
//        System.out.print("From:  ");
//        int from = sc.nextInt();
//
//        System.out.print("To: ");
//        int to = sc.nextInt();
//
//        if ((from % 2 == 1) || (to % 2 == 1)) {//(odd = numero impar)
//            System.out.println("Odd input!");
//        } else {
//            for (int i = from + 2; i < to; i += 2) {
//                total += i;
//            }
//            System.out.println("Total is: " + total);
//        }
        //twelveDaysOfChristmas();
    }

    public static void forHeaderTesting() {

        int total = 0;
        //1a
        for (int i = 0;; i++) {//omit the loop termination condition
            System.out.print("Please enter a number (-1 to exit): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;

            } else {
                total += num;
            }
        }
        System.out.println("total is " + total);
        //1b
        total = 0;
        final int NUM_INPUTS = 3;
        int j = 1;

        for (; j <= NUM_INPUTS; j++) {//omit the loop initialisation section
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            total += num;

        }
        System.out.println("total is " + total);
        //1c
        total = 0;
        for (int k = 1; k <= NUM_INPUTS;) {//omit the loop increment section
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            total += num;

            k++;
        }

        System.out.println("total is " + total);
        //1d
        total = 0;
        for (;;) {
            System.out.print("Please enter a number (-1 to exit):");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            } else {
                total += num;
            }
        }
        System.out.println("total is " + total);
    }

    public static void forSmallestLargest() {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.print("Please enter n: ");
        int n = sc.nextInt();// n is the number of numbers 

        if (n <= 0) {
            System.out.println("n was invalid: " + n);
        } else {
            //ok
            for (int i = 1; i <= n; i++) {
                System.out.print("Please enter a number: ");
                int num = sc.nextInt();

                if (num > largest) {// true first time
                    largest = num;
                }
                if (num < smallest) {// true first time
                    smallest = num;

                }

            }
            System.out.println("The largest number is: " + largest);
            System.out.println("The smallest number is: " + smallest);
        }
    }

    public static void forHistogram() {

        System.out.print("Please enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Please enter the number of colums: ");
        int col = sc.nextInt();
        // Assume user inputs 2 rows and 5 cols:
        //      *****
        //      *****
        // 2 loops:
        //    outer going from 1..2
        //      inner loop goes from 1..5

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("=");

            }
            System.out.println();// goto next line
        }
    }

    public static void forAverage() {
        double total = 0.0;

        System.out.print("How many numbers in the sequence? ");// n is the number of numbers 
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Please enter a number: ");
//            double num = sc.nextDouble();
//            total += num;
            total += sc.nextDouble();// the same result
        }
        double average = total / n;
        System.out.println("The average is: " + average);

    }

    public static void forSequence() {

        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.print(i * i);
            } else {
                System.out.print(i * i + ", ");
            }
        }
    }

    public static void forSumEvenNumbers() {//(even = numero par)
        int total = 0;
        System.out.print("From:  ");
        int from = sc.nextInt();

        System.out.print("To: ");
        int to = sc.nextInt();

        if ((from % 2 == 1) || (to % 2 == 1)) {//(odd = numero impar)
            System.out.println("Odd input!");
            //OK - BOTH VALUES ARE EVEN NUMBERS
        } else {
            for (int i = from + 2; i < to; i += 2) {
                total += i;
            }
            System.out.println("Total is: " + total);
        }
    }

    public static int forSumEvenNumbers(int from, int to) {
        int total = 0;
        for (int i = from + 2; i < to; i += 2) {
            total += i;
        }
        return total;

    }

    public static void twelveDaysOfChristmas() {
        for (int day = 1; day <= 12; day++) {
            System.out.print("On the ");
            switch (day) {
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.println("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eigth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
            }//end switch
            System.out.println("day of Christmas,\n My true love sent to me: ");// /n = new line character
            switch (day) {
                case 12:
                    System.out.println("\tTwelve drummers drumming, ");// /t = is a tab
                case 11:
                    System.out.println("\tEleven pipers piping, ");
                case 10:
                    System.out.println("\tTen lords a-leaping, ");
                case 9:
                    System.out.println("\tNine ladies dancing, ");
                case 8:
                    System.out.println("\tEight maids a-milking, ");
                case 7:
                    System.out.println("\tSeven swans a-swimming, ");
                case 6:
                    System.out.println("\tSix geese a-laying, ");
                case 5:
                    System.out.println("\tFive gold rings, ");
                case 4:
                    System.out.println("\tFour calling birds, ");
                case 3:
                    System.out.println("\tThree French hens, ");
                case 2:
                    System.out.println("\tTwo turtle doves,");
                case 1:
                    System.out.println("\tA partridge in a pear tree, ");
            }
        }// end for
    }

}
