package oop;

class MotorCar {

    private String theCarModel;
    private String theCarType;
    private int theAge;

    MotorCar(String aCarModel, String aCarType, int aCarAge) {
        theCarModel = aCarModel;
        theCarType = aCarType;
        theAge = aCarAge;

    }

    public String getCarModel() {
        return theCarModel;
    }

    public void setCarModel(String theCarModel) {
        this.theCarModel = theCarModel;
    }

    public String getCarType() {
        return theCarType;
    }

    public void setCarType(String theCarType) {
        this.theCarType = theCarType;
    }

    public int getAge() {
        return theAge;
    }

    public void setAge(int theAge) {
        this.theAge = theAge;
    }

    @Override
    public String toString() {
        return "MotorCar [carModel=" + theCarModel + ", carType=" + theCarType
                + ", ageOfCar=" + theAge + "]";
    }

}
