// Класс PaymentFactory (Фабрика для создания объектов оплаты)
public class PaymentFactory {

    /**
     * Фабричный метод для получения объекта платежа по его типу.
     *
     * @param type тип платежа ("creditcard", "paypal", "crypto")
     * @return объект, реализующий интерфейс PaymentMethod
     * @throws IllegalArgumentException если тип платежа недопустим
     */
    public static PaymentMethod getPaymentMethod(String type) {
        return switch (type.toLowerCase()) {
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "crypto" -> new CryptoPayment();
            default -> throw new IllegalArgumentException("Invalid payment method: " + type);
        };
    }
}
