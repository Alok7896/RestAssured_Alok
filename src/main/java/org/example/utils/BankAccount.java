package org.example.utils;

public class BankAccount {
    private long acctNumber;
    private String accountHdrName;
    private static long balance;

    public BankAccount(long acctNbr,String acctHoldr){
        this.acctNumber=acctNbr;
        this.accountHdrName=acctHoldr;
    }

    public void depositMoney(long amount){
        this.balance+=amount;
    }
    public void withdrawMoney(long amount){
        this.balance=balance-amount;
        if (balance<0)
            System.out.println("You don't have balance in your account");
        else
            System.out.println("Thank You Visit Again Your Account balance is "+balance);
    }

    public static void main(String[] args) {
        BankAccount bank=new BankAccount(231455542,"Alok Pradhan");
        bank.depositMoney(1000);
        bank.withdrawMoney(200);

    }

}
