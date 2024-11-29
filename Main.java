package ASSIGNMENT;

import java.util.Calendar;
import Lecture4_interfaces_abstract_classes.BankAccount;

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("18548", 1000 .00);

        // Printing initial account details
        System.out.println("Initial Account Details:");
        System.out.println(myAccount);

        // Creating a DepositTransaction object
        Calendar depositDate = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(500.00, "TXN001", depositDate);

        // Applying the deposit transaction
        System.out.println("\nApplying Deposit Transaction:");
        deposit.apply(myAccount);

        // Printing updated account details
        System.out.println("Updated Account Details:");
        System.out.println(myAccount);

        // Creating a WithdrawalTransaction object
        Calendar withdrawalDate = Calendar.getInstance();
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(300.00, withdrawalDate, "TXN002");

        // Applying the withdrawal transaction
        System.out.println("\nApplying Withdrawal Transaction:");
        try {
            withdrawal.apply(myAccount);
        } catch (InsufficientResourceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Printing updated account details
        System.out.println("Updated Account Details:");
        System.out.println(myAccount);

        // Testing reversal of withdrawal
        System.out.println("\nReversing Withdrawal Transaction:");
        boolean reversed = withdrawal.reverse(myAccount);
        System.out.println("Reversal Successful: " + reversed);

        // Printing final account details
        System.out.println("Final Account Details:");
        System.out.println(myAccount);
    }
}
