package Lecture4_interfaces_abstract_classes.ASSIGNMENT ;
import java.util.Calendar;

import Lecture4_interfaces_abstract_classes.BankAccount;

/**
 * Represents a WithdrawalTransaction that debits a specified amount from a bank account.
 * Extends the BaseTransaction class.
 */
public class WithdrawalTransaction extends BaseTransaction {
    /**
     * constructs a withdrwalTransaction that debits a specifid amount to a bank account  
     * @param amount
     * @param date
     * @param transactionID
     */
   public WithdrawalTransaction(double amount, Calendar date , String transactionID) { 
    super(amount,date, transactionID);

   }
   


   @Override

   
   public void apply(BankAccount ba) throws InsufficientResourceException {
       if (ba == null) {
           throw new InsufficientResourceException("Bank account is null.");
       }
       if (ba.getBalance() < getAmount()) {
           throw new InsufficientResourceException("Insufficient funds for withdrawal.");
       }
       ba.withdraw(getAmount());
       System.out.println("Withdrawal applied: " + getAmount());
   }
   
   /**
    * preconditions 
    - The bank account must not be null
    - The bank account must have sufficient funds to complete the withdrawal transaction

    * postconditions
     - The specified  withdrawal amount  is addd back to the bank account balance
     - A confirmation message is shown

     @param ba the bank account 
     @return true if the withdrawal transaction is reversed, false otherwise
    */

   public boolean reverse(BankAccount ba) {
    if ( ba == null){
        throw new IllegalArgumentException("Bank account cannot be  null for reversal.");
    }
      ba.deposit(getAmount());
      System.out.println("Withdrawal reversed: " + getAmount());
      return true;
   
}

}
