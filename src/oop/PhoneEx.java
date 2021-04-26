package oop;

public class PhoneEx {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        //System.out.println(p1.toString());
        System.out.println(p1);

        p1.setNumber("087-7568789");
        p1.setOwnersName("Jack Black");
        p1.setPrice(300.00);
        System.out.println(p1);

        Phone p2 = new Phone("086-9876735", "Mary Bloggs", 200.00);
        System.out.println("The number is " + p2.getNumber());
        System.out.println("The owners name is " + p2.getOwnersName());
        System.out.println("The price is " + p2.getPrice());

    }
}// end of class PhoneEx
//class Phone extends Object{

class Phone {
// the instance variables

    private String theNumber;
    private String theOwnersName;
    private double thePrice;
    private static int count;

    // constructors
    // no-arg constructor
    Phone() {// new Phone();
        theNumber = " ";
        theOwnersName = " ";
        thePrice = 0.0;
        count++;
    }
    // overloaded constructor

    Phone(String aNumber, String aOwnersName, double aPrice) {
        // new Phone("087-7654321", "JB", 763.22);
        theNumber = aNumber;
        theOwnersName = aOwnersName;
        thePrice = aPrice;
        count++;
    }

    public static int getCount() {
        return count;
    }
    // accessor methods ("get" methods)

    public String getNumber() {
        return theNumber;
    }

    public String getOwnersName() {
        return theOwnersName;
    }

    public double getPrice() {
        return thePrice;
    }
    // mutator methods ("set" methods)

    public void setNumber(String aNumber) {
        theNumber = aNumber;
    }

    public void setOwnersName(String theOwnersName) {
        this.theOwnersName = theOwnersName;
    }

    public void setPrice(double aPrice) {
// instance variable is assigned to be the 
// same as the parameter passed in
        if (aPrice < 0) {
            thePrice = aPrice;
        }
    }

    @Override
    public String toString() {
        return "The phone details are: " + theNumber + " ; " + theOwnersName + " ; " + thePrice;
    }
}//end of class Phone
