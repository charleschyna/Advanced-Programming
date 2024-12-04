package Lecture4_interfaces_abstract_classes.ASSIGNMENT;
import java.util.Calendar;

import Lecture4_interfaces_abstract_classes.BankAccount;

/**
 * Represents a depositTransaction that credits a specified amount to a bank account
 * extends the BaseTransaction class
 */

public class DepositTransaction extends BaseTransaction {

  /**
   * Constructor 
   * @param amount
   * @param transactionID
   * @param date
   */
  public DepositTransaction(double amount, String transactionID, Calendar date) {
      super(amount, date , transactionID );
  }

  /**
   * Apply the deposit transaction to the bank account.
   * preconditions
   * - The amount to deposit must be greater than 0
   * - The bank account must not be null
   * 
   * postconditions
   * - The amount is added to the bank account
   * - A success message is then printed
   * 
   * @param ba the bank account to deposit the amount to
   */

  @Override
  public void apply(BankAccount ba) {
     if (ba == null) {
         throw new IllegalArgumentException("Bank account is null.");
     }
     if (getAmount() <= 0) {
         throw new IllegalArgumentException("Amount to deposit must be greater than 0.");
     }

     ba.deposit(getAmount());
     System.out.println("Deposit Applied successfully:" + getAmount());
     
}
}
