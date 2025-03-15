// Класс PaymentFactory (Фабрика для создания объектов оплаты)
public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        return switch (type.toLowerCase()) {
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "crypto" -> new CryptoPayment();
            default -> throw new IllegalArgumentException("Invalid payment method: " + type);
        };
    }
}
