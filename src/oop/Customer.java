package oop;

class Customer {

    private int accountNo;
    private double balance;
    String name;
    private static int count;

    Customer() {

        accountNo = 0;
        balance = 0.0;
        name = " ";
        count++;
    }

    Customer(String name, int accountNo, double balance) {

        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getCount() {
        return count;
    }

    public double lodge(double amount) {
        balance += amount;
        return balance;
    }

    public boolean withdraw(double amount) {
        //if (balance - amt >= 0) {
        if (balance >= amount) {
            System.out.println("Balance of " + balance + " is " + "fine for a withdrawal of " + amount);
            balance -= amount;
            System.out.println("New balance is " + balance);
            return true;
        } else {
            System.out.println("Balance of " + balance + " is too small for a withdraw of " + amount);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer [name = " + name + ", accountNo = " + accountNo + ", balance = " + balance + "]";
    }
}
