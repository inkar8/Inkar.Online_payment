// Класс CreditCardPayment (Реализация оплаты кредитной картой)
public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);

        // Здесь можно добавить проверку карты, лимита и т. д.
        // В данном случае просто возвращаем true (успешный платеж)

        return true;
    }
}
