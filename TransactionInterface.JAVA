

public interface TransactionInterface {
    double getAmount();
    java.util.Calendar getDate();
    String getTransactionID();
    void apply(BankAccount ba); // Applies the transaction to a bank account
    void printTransactionDetails();
}
