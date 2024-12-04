package Lecture4_interfaces_abstract_classes.ASSIGNMENT;

/**
 *  Represents a basic bank account with functionalities for deposits, withdrawals,
 * and balance management
 */
public class BankAccount {
    private double balance ;


    /**
     * Creates a new bank account with the specified  initial balance
     * 
     * @param initialbalance the initial balance for the account (must not be negative)
     * @throws IllegalArgumentException if the initial balance is negative
     * 
     */

    public BankAccount(double initialbalance) {
        if (initialbalance < 0) {
            throw new IllegalArgumentException("Initial balance must not be negative");
        }
        this.balance = initialbalance;        
}
/**
 * gets the current balance of the account
 * @return the current balance 
 */
    public double getBalance() {
        return balance;
    }


    /**
     * deposits the specified amont in to the bank account
     * preconditions
     * -the deposit must be greater than 0
     * postconditions
     * - The specified amount is added to the current balance
     * 
     * @param amt the amount to be deposited
     * @throws IllegalArgumentExemption if the deposit is less than or equal to zero
     */
    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        
    }
    balance += amount;
    System.out.println("Deposited successfully: " + amount + "|New balance: " + balance);
}

/**
 * withdraws the specified amount from the bank account
 * preconditions
 * - amount must be greater than zero
 * - amount must be less than or equal to the current balance
 * postconditions
 * - the specified amount is subtracted from the current balance
 * @param amount the amount to withdraw from the bank account
 * @throws IllegalArgumentException if the amount is less than zero or greater than the current balance
 * @throws InsufficientResourceException if the amount is greater than the current balance
 */
    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }
        if (amount > 0){
            throw new InsufficientResourceException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn successfully: " + amount + "|New balance: " + balance);
    }
}
