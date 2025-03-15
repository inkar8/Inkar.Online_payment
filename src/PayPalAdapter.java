// Класс PayPalAdapter (Адаптер для интеграции PayPal API с PaymentMethod)
public class PayPalAdapter {
    private final PayPalAPI payPalAPI;

    public PayPalAdapter() {
        this.payPalAPI = new MockPayPalAPI();
    }

    public boolean pay(double amount) {
        return payPalAPI.sendPayment(amount);
    }
}
