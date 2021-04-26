package oop;

public class CarEx {

    public static void main(String[] args) {
        //1.a
        MotorCar bmw = new MotorCar("325", "BMW", 1);//String aCarModel, String aCarType, int aCarAge
        //1.a,b,c - (String aName, String aAddress, boolean aDrinkingDrivingOffense, boolean aCaughtWithoutASeatbelt,
        //boolean aDangerousOvertaking, boolean aUsingMobileWhileDriving, boolean aDrivingDefectiveVehicle,
        //boolean aCrossingContinuousWhiteLine, MotorCar aCar)
        Driver joeGouger = new Driver("Joe Gouger", "Someplace Dodgy", true, true, false, true, false, true, bmw);
        //2.
        System.out.println(joeGouger);
        //3.
        joeGouger.calculatePenaltyPoints();
        System.out.println(joeGouger.getName() + " has " + joeGouger.getTotalOfPoints() + " points. ");
        //4.
        joeGouger.setDrivingDefectiveVehicle(true);
        joeGouger.calculatePenaltyPoints();
        System.out.println(joeGouger.getName() + " has " + joeGouger.getTotalOfPoints() + " points. ");
        //5. 
        if (joeGouger.isDisqualified()) {
            System.out.println(joeGouger.getName() + " is disqualified.");
        } else {
            System.out.println(joeGouger.getName() + " is not disqualified.");
        }
        //6.
        MotorCar volvo = new MotorCar("S40", "Volvo", 4);
        Driver johnCivil = new Driver("John Civil", "Someplace Nice", false, false, false, false, false, false, volvo);
        //7.
        johnCivil.calculatePenaltyPoints();
        System.out.println(johnCivil.getName() + " has " + johnCivil.getTotalOfPoints() + " points. ");
        //8.
        johnCivil.setUsingMobileWhileDriving(true);
        johnCivil.calculatePenaltyPoints();
        System.out.println(johnCivil.getName() + " has " + johnCivil.getTotalOfPoints() + " points. ");
        //9.
        if (johnCivil.isDisqualified()) {
            System.out.println(johnCivil.getName() + " is disqualified.");
        } else {
            System.out.println(johnCivil.getName() + " is not disqualified.");
        }

    }

}
