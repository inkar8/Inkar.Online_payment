import java.util.ArrayList;
import java.util.List;

// Класс TransactionManager (Управление транзакциями)
public class TransactionManager {
    private final List<Transaction> transactions = new ArrayList<>();

    /**
     * Добавляет новую транзакцию в историю.
     *
     * @param amount сумма платежа
     * @param paymentMethod метод оплаты (например, "CreditCard", "PayPal")
     * @param status статус транзакции ("Pending", "Completed", "Failed")
     */
    public void addTransaction(double amount, String paymentMethod, String status) {
        Transaction transaction = new Transaction(amount, paymentMethod, status);
        transactions.add(transaction);
        System.out.println("Transaction recorded: " + transaction);
    }

    /**
     * Возвращает список всех транзакций.
     *
     * @return список транзакций
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Выводит историю всех транзакций.
     */
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
