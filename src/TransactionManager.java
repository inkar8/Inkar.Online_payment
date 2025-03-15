import java.util.ArrayList;
import java.util.List;

// Класс TransactionManager (Управление транзакциями)
public class TransactionManager {
    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(double amount, String paymentMethod, String status) {
        Transaction transaction = new Transaction(amount, paymentMethod, status);
        transactions.add(transaction);
        System.out.println("Transaction recorded: " + transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }


    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}
