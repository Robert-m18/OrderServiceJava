# Order Payment System (Java)

Simple Java application for processing orders with different payment methods.
The project demonstrates clean OOP design, SOLID principles and use of
Factory pattern.

## Features
- Reads orders from a text file
- Supports multiple payment methods (BLIK, Card, PayPal, Apple Pay)
- Easily extensible without modifying existing code

## Architecture
- Model: `Order`
- Service: `OrderService`
- Repository: `OrderRepository`
- Factory: `PaymentFactory`, `PaymentType`
- Payment abstraction: `PaymentMethod`

## Concepts used
- SOLID principles
- Factory Method
- Enum + Supplier
- Dependency Injection (constructor)
- Try-with-resources

## How to run
1. Place `zamowienia.txt` in the project root
2. Run `Main`

### Example input
1, 120.50, BLIK\
2, 50, CARD\
3, 200, PAYPAL