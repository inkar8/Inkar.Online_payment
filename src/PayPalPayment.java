// Класс PayPalPayment (Реализация оплаты через PayPal)
public class PayPalPayment implements PaymentMethod {
    private PayPalAdapter payPalAdapter;

    public PayPalPayment() {
        this.payPalAdapter = new PayPalAdapter();
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);

        return payPalAdapter.pay(amount);
    }
}
