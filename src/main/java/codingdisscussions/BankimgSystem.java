package codingdisscussions;

import java.util.ArrayList;
import java.util.List;

abstract class NewAccount{
    public  int accountNo;
    public double amount;
    public static List<Integer> array=new ArrayList<Integer>();

    public NewAccount(int accountNo, double balance){
        this.accountNo = accountNo;
        this.amount= balance;
        array.add(accountNo);
    }

   abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract double calculateInterest(int months);

    double getBalance(){
        return this.amount;
    }

    void getAccountNo(){
        System.out.println(array);
    }


}


class SvaingsAccount extends NewAccount {


    private double intrest= 1.89;
    public SvaingsAccount(int accountNo, double balance){
        super(accountNo,balance);
    }
    @Override
    void withdraw(double amount) {
        if(this.amount>=amount) this.amount-=amount;
        else System.out.println("Insufficient Balance");
    }

    @Override
    void deposit(double amount) {
        this.amount+=amount;
    }

    @Override
    double calculateInterest(int months) {
        double finalIntrest= intrest*months;
        return (finalIntrest*this.amount)/100;
    }
}


class PensionAccount extends SvaingsAccount{


    public PensionAccount(int accountNo, double balance){
        super(accountNo,balance);
    }
    //method overriding
    double calculateInterest(int months){
        double finalIntrest= 2.0*months;
        return (finalIntrest*this.amount)/100;
    }
    double calculateInterest(int months,double charge){
        double finalIntrest= charge*months;
        return (finalIntrest*this.amount)/100;
    }
}


class SalaryAccount extends NewAccount{
    private final double intrest= 2.12;
    public SalaryAccount(int accountNo, double balance){
        super(accountNo,balance);
    }
    @Override
    void withdraw(double amount) {
        if(this.amount>=amount) this.amount-=amount;
        else System.out.println("Insufficient Balance");
    }

    @Override
    void deposit(double amount) {
        this.amount+=amount;
        System.out.println("ammount added successfully");
    }

    @Override
    double calculateInterest(int months) {
        double finalIntrest= intrest*months;
        return (finalIntrest*this.amount)/100;
    }
}







public class BankimgSystem {
    public static void main(String[] args) {
        //savings account

        NewAccount newAccount= new SvaingsAccount(123,500);

        System.out.println(newAccount.getBalance());

        newAccount.deposit(3000);
        System.out.println(newAccount.getBalance());
        System.out.println(newAccount.calculateInterest(12));

// Salary account


        NewAccount newAccount1= new SalaryAccount(125,500);

        System.out.println(newAccount1.getBalance());

        newAccount1.deposit(3000);
        System.out.println(newAccount1.getBalance());
        System.out.println(newAccount1.calculateInterest(12));

        //pension account
        System.out.println("Pension Account");
        PensionAccount pensiomAccount= new PensionAccount(128,1000);
        System.out.println(pensiomAccount.getBalance());
        pensiomAccount.deposit(30000);
        System.out.println(pensiomAccount.getBalance());
        System.out.println(pensiomAccount.calculateInterest(12));
// method overloading
        System.out.println(" the pension percent after charge  "+pensiomAccount.calculateInterest(12,1.56));

        pensiomAccount.getAccountNo();

    }
}

