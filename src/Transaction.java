import java.time.LocalDateTime;

// Класс Transaction (Представляет одну транзакцию)
public class Transaction {
    private static int counter = 1; // Счетчик для генерации уникальных ID
    private final int id;
    private final double amount;
    private final String paymentMethod;
    private final String status;
    private final LocalDateTime timestamp;

    // Конструктор
    public Transaction(double amount, String paymentMethod, String status) {
        this.id = counter++;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // Переопределение toString() для удобного вывода информации
    @Override
    public String toString() {
        return "Transaction{" +
                "ID=" + id +
                ", Amount=$" + amount +
                ", PaymentMethod='" + paymentMethod + '\'' +
                ", Status='" + status + '\'' +
                ", Timestamp=" + timestamp +
                '}';
    }
}
