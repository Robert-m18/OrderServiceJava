public class PaypalPayment implements PaymentMethod{
    @Override
    public void pay(double payment) {
        System.out.printf("Płatność PayPal: %.2f zł%n", payment);

    }
}
