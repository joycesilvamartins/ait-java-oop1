package oop;

public class Family {

    public static void main(String[] args) {
        // Person(int age, String name, String address) {
        Person jack = new Person(25, "Jack", "Moate");
        Person john = new Person(22, "John", "Dublin");
        Person ann = new Person(25, "Ann", "Athlone");
        System.out.println("The number of object created is: " + Person.getCount());


        // 1. John has moved to "Galway"
        john.setAddress("Galway");
        System.out.println("John:" + john);
        // 2. Ann has celebrated her birthday
        ann.setAge(26);
        System.out.println("Ann:" + ann);
        // 3. Jack has changed his name to "JJ"    
        jack.setName("JJ");
        System.out.println("Jack:" + jack);
    }
}
