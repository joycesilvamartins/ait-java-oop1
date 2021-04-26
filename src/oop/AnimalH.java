package oop;

class AnimalH {

    private String theBreed;
    private String theGender;

    public AnimalH(String aBreed, String aGender) {
        theBreed = aBreed;
        theGender = aGender;

    }

    @Override
    public String toString() {
        return "Horse{" + " breed=" + theBreed + " gender=" + theGender + "}";

    }

    public String getBreed() {
        return theBreed;
    }

    public void setBreed(String aBreed) {
        theBreed = aBreed;
    }

    public String getGender() {
        return theGender;
    }

    public void setGender(String aGender) {
        theGender = aGender;
    }

}
