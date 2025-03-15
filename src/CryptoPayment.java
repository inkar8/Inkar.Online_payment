// Класс CryptoPayment (Реализация оплаты криптовалютой)
public class CryptoPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);

        // Здесь можно добавить проверку блокчейн-сети, комиссии, подтверждений и т. д.
        // В данном случае просто возвращаем true (успешный платеж)

        return true;
    }
}
