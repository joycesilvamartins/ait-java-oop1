package oop;

class Driver {

    private String theName;
    private String theAddress;
    private boolean drinkingDrivingOffense;
    private boolean caughtWithoutASeatbelt;
    private boolean dangerousOvertaking;
    private boolean usingMobileWhileDriving;
    private boolean drivingDefectiveVehicle;
    private boolean crossingContinuousWhiteLine;
    private int theTotalOfPoints;
    private MotorCar theCar;

    Driver(String aName, String aAddress, MotorCar aCar) {
        theName = aName;
        theAddress = aAddress;
        theCar = aCar;
    }

    Driver(String aName, String aAddress, boolean aDrinkingDrivingOffense, boolean aCaughtWithoutASeatbelt,
            boolean aDangerousOvertaking, boolean aUsingMobileWhileDriving, boolean aDrivingDefectiveVehicle,
            boolean aCrossingContinuousWhiteLine, MotorCar aCar) {
        theName = aName;
        theAddress = aAddress;
        this.drinkingDrivingOffense = aDrinkingDrivingOffense;
        caughtWithoutASeatbelt = aCaughtWithoutASeatbelt;
        dangerousOvertaking = aDangerousOvertaking;
        usingMobileWhileDriving = aUsingMobileWhileDriving;
        drivingDefectiveVehicle = aDrivingDefectiveVehicle;
        crossingContinuousWhiteLine = aCrossingContinuousWhiteLine;
        theCar = aCar;

    }

    public String getName() {
        return theName;
    }

    public void setName(String theName) {
        this.theName = theName;
    }

    public String getAddress() {
        return theAddress;
    }

    public void setAddress(String theAddress) {
        this.theAddress = theAddress;
    }

    public boolean isDrinkingDrivingOffense() {
        return drinkingDrivingOffense;
    }

    public void setDrinkingDrivingOffense(boolean drinkingDrivingOffense) {
        this.drinkingDrivingOffense = drinkingDrivingOffense;
    }

    public boolean isCaughtWithoutASeatbelt() {
        return caughtWithoutASeatbelt;
    }

    public void setCaughtWithoutASeatbelt(boolean caughtWithoutASeatbelt) {
        this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
    }

    public boolean isDangerousOvertaking() {
        return dangerousOvertaking;
    }

    public void setDangerousOvertaking(boolean dangerousOvertaking) {
        this.dangerousOvertaking = dangerousOvertaking;
    }

    public boolean isUsingMobileWhileDriving() {
        return usingMobileWhileDriving;
    }

    public void setUsingMobileWhileDriving(boolean usingMobileWhileDriving) {
        this.usingMobileWhileDriving = usingMobileWhileDriving;
    }

    public boolean isDrivingDefectiveVehicle() {
        return drivingDefectiveVehicle;
    }

    public void setDrivingDefectiveVehicle(boolean drivingDefectiveVehicle) {
        this.drivingDefectiveVehicle = drivingDefectiveVehicle;
    }

    public boolean isCrossingContinuousWhiteLine() {
        return crossingContinuousWhiteLine;
    }

    public void setCrossingContinuousWhiteLine(boolean crossingContinuousWhiteLine) {
        this.crossingContinuousWhiteLine = crossingContinuousWhiteLine;
    }

    public int getTotalOfPoints() {
        return theTotalOfPoints;
    }

    public void setTotalOfPoints(int theTotalOfPoints) {
        this.theTotalOfPoints = theTotalOfPoints;
    }

    public MotorCar getCar() {
        return theCar;
    }

    public void setCar(MotorCar theCar) {
        this.theCar = theCar;
    }

    @Override
    public String toString() {
        return "Driver details [name=" + getName() + ", address=" + getAddress()
                + ", drinkDrivingOffence=" + isDrinkingDrivingOffense()
                + ", caughtWithoutASeatbelt=" + isCaughtWithoutASeatbelt()
                + ", dangerousOvertaking=" + isDangerousOvertaking()
                + ", usingMobileWhileDriving=" + isUsingMobileWhileDriving()
                + ", drivingDefectiveVehicle=" + isDrivingDefectiveVehicle()
                + ", crossingContinuousWhiteline="
                + isCrossingContinuousWhiteLine() + ", car=" + theCar
                + ", totalPenaltyPoints=" + getTotalOfPoints() + "]";
    }

    public void calculatePenaltyPoints() {
        int total = 0;
        if (isDrinkingDrivingOffense()) {
            total += 5;
        }
        if (isCaughtWithoutASeatbelt()) {
            total += 5;
        }
        if (isDangerousOvertaking()) {
            total += 5;
        }
        if (isUsingMobileWhileDriving()) {
            total += 5;
        }
        if (isDrivingDefectiveVehicle()) {
            total += 5;
        }
        if (isCrossingContinuousWhiteLine()) {
            total += 4;
        }
        // single point of responsibility i.e. dont set the instance variable
        // here; use the "set" method for that
        setTotalOfPoints(total);
    }

    public boolean isDisqualified() {
        final int DISQUALIFIED_MIN = 12;

        if (getTotalOfPoints() >= DISQUALIFIED_MIN) {
            return true;
        } else {
            return false;

        }

    }
}
