// Класс PayPalPayment (Реализация оплаты через PayPal)
public class PayPalPayment implements PaymentMethod {
    private PayPalAdapter payPalAdapter;

    // Конструктор инициализирует адаптер PayPal
    public PayPalPayment() {
        this.payPalAdapter = new PayPalAdapter();
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);

        // Используем адаптер для обработки платежа через PayPal API
        return payPalAdapter.pay(amount);
    }
}
