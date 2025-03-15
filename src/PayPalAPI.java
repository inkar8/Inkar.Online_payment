// Интерфейс PayPalAPI (Эмуляция внешнего API PayPal)
public interface PayPalAPI {

    /**
     * Отправляет платеж через PayPal.
     *
     * @param amount сумма платежа
     * @return true, если платеж успешен, иначе false
     */
    boolean sendPayment(double amount);
}
