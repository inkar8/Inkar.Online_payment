// Класс CryptoPayment (Реализация оплаты криптовалютой)
public class CryptoPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);

        return true;
    }
}
