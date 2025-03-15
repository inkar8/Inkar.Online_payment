// Интерфейс PaymentMethod (Общий контракт для всех способов оплаты)
public interface PaymentMethod {
    boolean processPayment(double amount);
}
