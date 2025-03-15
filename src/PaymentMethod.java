// Интерфейс PaymentMethod (Общий контракт для всех способов оплаты)
public interface PaymentMethod {
    /**
     * Обрабатывает платеж.
     *
     * @param amount сумма платежа
     * @return true, если платеж успешен, иначе false
     */
    boolean processPayment(double amount);
}
