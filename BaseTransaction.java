package ASSIGNMENT;
import java.util.Calendar;


import Lecture4_interfaces_abstract_classes.BankAccount;

import Lecture4_interfaces_abstract_classes.TransactionInterface;

public  abstract class BaseTransaction implements TransactionInterface {
private double amount;
    private Calendar date;
    private String transactionID;

    public BaseTransaction(double amount, Calendar date, String transactionID) {
        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Calendar getDate() {
        return date;
    }

    @Override
    public String getTransactionID() {
        return transactionID;
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }



    @Override
    public abstract void apply(BankAccount ba);
}

