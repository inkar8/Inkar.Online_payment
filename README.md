Online Payment Gateway
Overview
This project is an **Online Payment Gateway** system that supports multiple payment methods, including **Credit Card, PayPal, and Cryptocurrency**. It follows key software design patterns such as **Factory Method** and **Adapter** to ensure flexibility and scalability.

System Architecture:
1. Design Patterns Used
- Factory Method: Encapsulates the creation of different payment methods, ensuring easy extension for new payment options.
- Adapter: Integrates an external (or mock) API, ensuring compatibility with our internal payment interface.

2. Main Components
- PaymentMethod (Interface): Defines the processPayment(double amount) method for all payment types.
- Concrete Payment Classes: Implement PaymentMethod to handle different payment methods:
  - CreditCardPayment
  - PayPalPayment
  - CryptoPayment
- PaymentFactory: Uses the Factory Method pattern to create instances of payment classes dynamically.
- PayPalAPI (Interface): Represents an external payment service.
- MockPayPalAPI (Implementation of PayPalAPI): Simulates PayPal transactions.
- PayPalAdapter: Converts PayPal API calls into a format compatible with `PaymentMethod`.
- Transaction: Represents individual payment transactions.
- TransactionManager: Manages and stores transaction history.
- PaymentDemo: Provides a command-line interface for users to select payment methods and process transactions.
- Main: Entry point for the program.

Features
✅ Supports three payment methods (Credit Card, PayPal, Crypto)  
✅ Factory Pattern ensures flexibility in adding new payment methods  
✅ Adapter Pattern for integrating external payment APIs  
✅ Transaction logging with status tracking  
✅ Error handling for invalid transactions  
