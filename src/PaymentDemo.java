import java.util.Scanner;

// Класс PaymentDemo (Тестирование системы оплаты)
public class PaymentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionManager transactionManager = new TransactionManager();

        System.out.println("Welcome to the Payment System!");
        while (true) {
            System.out.println("\nSelect a payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Cryptocurrency");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после nextInt()

            if (choice == 5) {
                System.out.println("Exiting the system. Thank you!");
                break;
            }

            if (choice == 4) {
                transactionManager.printTransactionHistory();
                continue;
            }

            System.out.print("Enter payment amount: $");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            PaymentMethod paymentMethod;
            String methodName;

            switch (choice) {
                case 1 -> {
                    paymentMethod = PaymentFactory.getPaymentMethod("creditcard");
                    methodName = "Credit Card";
                }
                case 2 -> {
                    paymentMethod = PaymentFactory.getPaymentMethod("paypal");
                    methodName = "PayPal";
                }
                case 3 -> {
                    paymentMethod = PaymentFactory.getPaymentMethod("crypto");
                    methodName = "Cryptocurrency";
                }
                default -> {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }
            }

            System.out.println("Processing your payment...");
            boolean success = paymentMethod.processPayment(amount);

            String status = success ? "Completed" : "Failed";
            transactionManager.addTransaction(amount, methodName, status);

            System.out.println("Transaction " + status + "!\n");
        }

        scanner.close();
    }
}
