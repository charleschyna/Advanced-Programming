package ASSIGNMENT;
import java.util.Calendar;

import Lecture4_interfaces_abstract_classes.BankAccount;


public class DepositTransaction extends BaseTransaction {
  public DepositTransaction(double amount, String transactionID, Calendar date) {
      super(amount, date , transactionID );
  }
  @Override
  public void apply(BankAccount ba) {
     ba.deposit(getAmount());
     System.out.println("Deposit Applied successfully:" + getAmount());
     
}
