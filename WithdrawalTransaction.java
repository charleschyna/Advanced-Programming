package ASSIGNMENT ;
import java.util.Calendar;

import Lecture4_interfaces_abstract_classes.BankAccount;
public class WithdrawalTransaction extends BaseTransaction {
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
   
   public boolean reverse(BankAccount ba) {
      ba.deposit(getAmount());
      System.out.println("Withdrawal reversed: " + getAmount());
      return true;
   
}

}
