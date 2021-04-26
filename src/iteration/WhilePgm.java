package iteration;

import java.util.Scanner;

public class WhilePgm {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //thirdOrderPolynomial();
        //whileAverage();
        //whileGrades();
        //  whileHistogram();
        // whileLargestSmallest();
        //whileSales();
        //whileSquares();
        //whileAverageSentinal();
        userInputTerminatesLoop();

    }
        public static void userInputTerminatesLoop(){
        String userInput="y";
        
        while(userInput.equalsIgnoreCase("y")){
            // do something...
            
            System.out.print("COntinue (y/n)? ");
            userInput = sc.next();
        }
    }
    
    
    
    public static void thirdOrderPolynomial() {//Ex.1

        double a = 0, b = 0, c = 0, d = 0, x = 0, fx = 0;

        // get the coefficients of the polynomial
        System.out.print("Please enter the coeficient a: ");
        a = sc.nextDouble();

        System.out.print("Please enter the coeficient b: ");
        b = sc.nextDouble();

        System.out.print("Please enter the coeficient c: ");
        c = sc.nextDouble();

        System.out.print("Please enter the coeficient d: ");
        d = sc.nextDouble();

        String keepGoing = "y";
        while (keepGoing.equalsIgnoreCase("y")) {
            // input x
            System.out.print("Please enter the value of x: ");
            x = sc.nextDouble();

            // calculate the polynomial at x
            //  f(x) = ax3 + bx2 + cx + d;
            fx = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;
            System.out.println("fx at " + x + " is " + fx);

            System.out.print("Continue (y/n)?");
            keepGoing = sc.next();
        }

    }

    public static void whileAverage() {//Ex2

        double num = 0.0, n = 0.0, average = 0.0, total = 0.0;
        int numbersEntered = 0;//tracks the number of numbers we have entered

        System.out.println("How many numbers in the sequence?  ");
        n = sc.nextInt();// n is the number of numbers 

        while (numbersEntered < n) {
            System.out.println("Please enter a number: ");
            num = sc.nextInt();
            total += num;// total = total + num;

            numbersEntered++;

        }
        average = total / n;
        System.out.println("The average is: " + average);

    }

    public static void whileGrades() {

        String grade = " ";
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0;
        // the very first grade
        System.out.println("Please enter a grade (A - F/ a-f) or x/X to exit: ");
        grade = sc.next().toLowerCase();

        while (!grade.equalsIgnoreCase("x")) {// if its an "x" then !T == F
            switch (grade) {
                case "a":
                    aCount++;
                    break;
                case "b":
                    bCount++;
                    break;
                case "c":
                    cCount++;
                    break;
                case "d":
                    dCount++;
                    break;
                case "e":
                    eCount++;
                    break;
                case "f":
                    fCount++;
                    break;
                default:
                    System.out.println("Error" + grade);
                    break;
            }
              // the other grades...
            System.out.println("Please enter a grade (A - F/ a-f) or x/X to exit: ");
            grade = sc.next().toLowerCase();

        }
        System.out.println("Number of grade A's is: " + aCount);
        System.out.println("Number of grade B's is: " + bCount);
        System.out.println("Number of grade C's is: " + cCount);
        System.out.println("Number of grade D's is: " + dCount);
        System.out.println("Number of grade E's is: " + eCount);
        System.out.println("Number of grade F's is: " + fCount);

    }

    public static void whileHistogram() {
        System.out.print("Please enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please enter number of cols: ");
        int cols = sc.nextInt();

        // Assume user inputs 2 rows and 5 cols:
        //      *****
        //      *****
        // 2 loops:
        //    outer going from 1..2
        //      inner loop goes from 1..5
        int i = 1, j = 1;
        while (i <= rows) {
            j = 1; // reset j for rows 2,3,4....
            while (j <= cols) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // goto next line
            i++;
        }

    }

    public static void whileLargestSmallest() {

        int i = 1, smallest = 0, largest = 0;

        System.out.print("Please enter a  number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n was invalid: " + n);
        } else {
            // ok
            while (i <= n) {
                System.out.print("Please enter a  number: ");
                int number = sc.nextInt();

                if (i == 1) { // the first number
                    smallest = number;
                    largest = number;
                } else if (number > largest) {
                    largest = number;
                } else if (number < smallest) {
                    smallest = number;
                }

                i++;
            }
            System.out.println("The largest number is " + largest);
            System.out.println("The smallest number is " + smallest);
        }
    }

    public static void whileSales() {
        double sales = 0.0, salary = 0.0;
        final double BASIC_SALARY = 3000.0;
        final double COMMISSION = 0.09;

        System.out.print("Please enter sales (-1 to end): ");//take in (ask user)
        sales = sc.nextDouble();

        while (sales >= 0) {
            salary = BASIC_SALARY + COMMISSION * sales;
            System.out.println("Salary is: " + salary);

            System.out.print("Please enter sales (-1 to end): ");//take in (ask user)
            sales = sc.nextDouble();

        }

    }

    public static void whileSquares() {
        int x = 1, square = 0, total = 0;

        while (x <= 5) {
            square = x * x;
            System.out.println("The square is: " + square);
            total += square;
            x++;

        }
        System.out.println("The total is: " + total);

    }
    public static void whileAverageSentinal(){
        double total = 0.0;
        int numberEntered = 0;
        
        System.out.print("Please enter a number (-1 to exit): ");
        double num = sc.nextDouble();
        
        while(num!=-1){
            total+=num;
            numberEntered++;
            
             System.out.print("Please enter a number (-1 to exit): ");
             num = sc.nextDouble();
             
             if(numberEntered == 0){
                 System.out.println("No number entered!");
                             
             }else{//ok
                double average = total/numberEntered;
                 System.out.println("The average is: " + average);
             }
            
        }
    }

}
