package oop;

class Biscuit {

    private String theTypeOfBiscuit;
    private String theCompany;
    private int theNumberOfBiscuit;
    private String theLocation;

    Biscuit() {

    }

    Biscuit(String aTypeOfBiscuit, String aCompany, int aNumberOfBiscuit, String aLocation) {
        theCompany = aCompany;
        theTypeOfBiscuit = aTypeOfBiscuit;
        theNumberOfBiscuit = aNumberOfBiscuit;
        theLocation = aLocation;

    }

    public int getNumberOfBiscuit() {
        return theNumberOfBiscuit;
    }

    public void setNumberOfBiscuit(int aNumberOfBiscuit) {
        this.theNumberOfBiscuit = aNumberOfBiscuit;
    }

    public String getTypeOfBiscuit() {
        return theTypeOfBiscuit;
    }

    public void setTypeOfBiscuit(String aTypeOfBiscuit) {
        this.theTypeOfBiscuit = aTypeOfBiscuit;
    }

    public String getCompany() {
        return theCompany;
    }

    public void setCompany(String aCompany) {
        this.theCompany = aCompany;
    }

    public String getLocation() {
        return theLocation;

    }

    public void setLocation(String aLocation) {
        this.theLocation = aLocation;
    }

    @Override
    public String toString() {
        return "Biscuit details: " + theTypeOfBiscuit + " " + theCompany + " " + theNumberOfBiscuit + " " + theLocation;

    }

}
