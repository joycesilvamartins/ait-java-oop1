package oop;

public class Bank {

    public static void main(String[] args) {
        //1.
        Customer joe = new Customer("Joe Bloggs", 1221, 100);
        Customer ann = new Customer("Ann Bloggs", 4443, 200);
        joe.setName("Joe Bloggs");
        ann.setName("Ann Bloggs");
        System.out.println("Joe: " + joe);
        System.out.println("Ann: " + ann);
        System.out.println("The number of objects created is: " + Customer.getCount());
        //2.
        joe.setName("Joseph Bloggs");
        System.out.println("Joe: " + joe);
        //3.
        System.out.println(ann.withdraw(250));//false
        ann.lodge(100);
        //try again
        System.out.println(ann.withdraw(250));//false
        System.out.println("Ann= " + ann);
        ann.setBalance(300);
        System.out.println("Ann's balance: " + ann.getBalance());
        //joe
        System.out.println("Joe is lodging 100: " + joe.lodge(100));
        System.out.println("Joe is withdrawing 50: " + joe.withdraw(50));
        System.out.println("Joe is withdrawing 500: " + joe.withdraw(500));
    }
}
