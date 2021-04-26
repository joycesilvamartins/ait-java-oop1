package oop;

class Car {

    private String theMake, theModel, theColour;// null by default
    private double theEngineSize;//0.0 by default
    private boolean automatic;//false by default

    private static int count;//0 by default

    Car() {
        count++;
    }

    Car(String theMake, String aModel, double aEngineSize, boolean aAutomatic, String aColour) {
        this.theMake = theMake;
        theModel = aModel;
        theColour = aColour;
        automatic = aAutomatic;
        theEngineSize = aEngineSize;
        count++;
    }

    public String getTMake() {
        return theMake;
    }

    public void setMake(String aMake) {
        theMake = aMake;
    }

    public String getModel() {
        return theModel;
    }

    public void setModel(String aModel) {
        theModel = aModel;
    }

    public String getColour() {
        return theColour;
    }

    public void setColour(String aColour) {
        theColour = aColour;
    }

    public double getEngineSize() {
        return theEngineSize;
    }

    public void setEngineSize(double aEngineSize) {
        theEngineSize = aEngineSize;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean aAutomatic) {
        automatic = aAutomatic;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Car details: " + theMake + " " + theModel + " " + theEngineSize + " " + theColour + " " + automatic;
    }

}
