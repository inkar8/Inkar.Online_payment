// Класс MockPayPalAPI (Эмуляция внешнего API PayPal)
public class MockPayPalAPI implements PayPalAPI {

    @Override
    public boolean sendPayment(double amount) {
        System.out.println("Mock PayPal API: Processing payment of $" + amount);

        // Здесь можно добавить логику проверки аккаунта, баланса, лимитов и т. д.
        // Пока просто имитируем успешный платеж.

        return true;
    }
}
