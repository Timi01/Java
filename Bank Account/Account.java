package BankAccount;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

   // constructor overloading - creating more cunstructors with the same name
//    public Account(){ // empty constructor
//        System.out.println("Empty constructor called.\n");
//    }
//    public Account(){ // empty constructor with default value
//        System.out.println("Empty constructor called.\n");
//        this.balance = 0.0;
//    }

    public Account(){ // empty constructors which calls the constructor with parameters and set default values
        this("000", 0.0, "Default Name", "default@email.com", "000-000-0000");
    }

    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber){
        System.out.println("\nAccount constructor with parameters called.\n");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made."+" \nThe new balance is: $" + this.balance + "\n");
    }
    public void withdrawal(double withdrawalAmount){

        if(withdrawalAmount <= this.balance){
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. \nRemaining balance is $" + this.balance);
        }else {
            System.out.println("Only " + this.balance + " available. Withdrawal is not processed.");
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String geNumber(){
        return this.number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }



}


