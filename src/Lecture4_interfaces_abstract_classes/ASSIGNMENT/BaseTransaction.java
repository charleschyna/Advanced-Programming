package Lecture4_interfaces_abstract_classes.ASSIGNMENT;
import java.util.Calendar;


import Lecture4_interfaces_abstract_classes.BankAccount;

import Lecture4_interfaces_abstract_classes.TransactionInterface;

public  class BaseTransaction implements TransactionInterface {
private double amount;
    private Calendar date;
    private String transactionID;

   /**
    @param amount  It should be a positive number
    @param date    the date cannot be null
    @param transactionID it cannot be null or empty
    @throws illegalArgumentException
    */
    public BaseTransaction(double amount, Calendar date, String transactionID) {
       if (amount <=0){
          throw new IllegalArgumentException("Amount must be positive");
          
       }
       if (date ==null){
         throw new IllegalArgumentException("Date must not be null");

       }
       if (transactionID ==null){
         throw new IllegalArgumentException("Transaction ID must not be null");
       }
        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }
  
    /**
     * returns the amount
     * @return amount of the transaction
     */
    @Override
    public double getAmount() {
        return amount;
    }

    /**
     * retrives the date of the transaction
     * @return date of the transaction
     */

    @Override
    public Calendar getDate() {
        return date;
    }

    /**
      It retrives the unique identifier for the transaction 
      @return unique identifier for the transaction

     */
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


    /**
     * @param ba the bankAccount object to which this transaction will be applied
     * @throws IllegalArgumentException if the bankAccount is null
     * 
     */
     

    @Override
    public void apply(BankAccount ba){
        if (ba == null){
            throw new IllegalArgumentException("BankAccount must not be null");
        }
        System.out.println("BaseTransaction applied ");
}

}


