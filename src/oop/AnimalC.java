package oop;

class AnimalC {

    private String theBreed;
    private String theGender;

    public AnimalC(String aBreed, String aGender) {
        theBreed = aBreed;
        theGender = aGender;

    }
    @Override
    public String toString(){
        return "Cow{" +" breed=" + theBreed + " gender=" + theGender + "}";
        
    }

    public String getBreed() {
        return theBreed;
    }

    public void setTheBreed(String aBreed) {
        theBreed = aBreed;
    }

    public String getGender() {
        return theGender;
    }

    public void setGender(String aGender) {
        theGender = aGender;
    }

}
