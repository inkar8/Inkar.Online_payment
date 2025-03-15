// Класс PayPalAdapter (Адаптер для интеграции PayPal API с PaymentMethod)
public class PayPalAdapter {
    private final PayPalAPI payPalAPI;

    // Конструктор инициализирует адаптер с реализацией API (MockPayPalAPI)
    public PayPalAdapter() {
        this.payPalAPI = new MockPayPalAPI();
    }

    /**
     * Метод адаптации вызова внешнего API к внутреннему интерфейсу.
     * @param amount сумма платежа
     * @return true, если платеж успешен, иначе false
     */
    public boolean pay(double amount) {
        return payPalAPI.sendPayment(amount);
    }
}
