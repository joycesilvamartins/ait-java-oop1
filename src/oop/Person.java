package oop;

class Person {

    private int age;
    private String name;
    private String address;
    private static int count;

    Person(int age, String name, String address) {

        this.age = age;
        this.name = name;
        this.address = address;
        count ++;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        if(age < 0 ){ // bad value
            System.err.println("Invalid age: "+age);
        }else{
            this.age = age;        
        }
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getCount() {
        return count;

    }
    @Override
    public String toString(){
        return "Person [age= " + age + ", name= " + name + ", address= " + address + "]";
        
    }

}
