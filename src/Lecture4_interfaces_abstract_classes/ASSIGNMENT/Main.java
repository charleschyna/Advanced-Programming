package Lecture4_interfaces_abstract_classes.ASSIGNMENT;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
       
        BankAccount myAccount = new BankAccount(1000.00);
        System.out.println("=== Initial Account Details ===");
        System.out.println(myAccount);

                Calendar depositDate = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(500.00, "TXN001", depositDate);

        System.out.println("\n=== Applying Deposit Transaction ===");
        deposit.printTransactionDetails();
        deposit.apply(myAccount);

        System.out.println("\n=== Updated Account Details After Deposit ===");
        System.out.println(myAccount);

               Calendar withdrawalDate = Calendar.getInstance();
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(300.00, withdrawalDate, "TXN002");

        System.out.println("\n=== Applying Withdrawal Transaction ===");
        withdrawal.printTransactionDetails();
        try {
            withdrawal.apply(myAccount);
        } catch (IllegalStateException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        }

        System.out.println("\n=== Updated Account Details After Withdrawal ===");
        System.out.println(myAccount);

       

        System.out.println("\n=== Final Account Details ===");
        System.out.println(myAccount);
    }
}
