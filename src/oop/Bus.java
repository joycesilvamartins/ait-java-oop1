package oop;

class Bus {

    private int theNumberOfSeats;// instance var
    private String theDriversName;
    private String theMake;
    private static int theCount;// class var

    Bus() {
        theNumberOfSeats = 0;
        theDriversName = " ";
        theMake = " ";
        theCount++;
    }

    Bus(String aDriversName, int aNumberOfSeats, String aMake) {
        theDriversName = aDriversName;
        theNumberOfSeats = aNumberOfSeats;
        theMake = aMake;
        theCount++;
    }

    public String getDriversName() {
        return theDriversName;
    }

    public void setDriversName(String aDriversName) {
        theDriversName = aDriversName;
    }

    public int getNumberOfSeats() {
        return theNumberOfSeats;
    }

    public void setNumberOfSeats(int aNumberOfSeats) {
        theNumberOfSeats = aNumberOfSeats;
    }

    public String getMake() {
        return theMake;
    }

    public void setMake(String aMake) {
        theMake = aMake;
    }

    public static int getCount() {
        return theCount;
    }

    @Override
    public String toString() {
        return "Bus [the drivers name= " + theDriversName + " the numbers of seats= " + theNumberOfSeats + " the make= " + theMake + " ]";
    }
}
