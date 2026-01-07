public class ApplePayPayment implements  PaymentMethod{
    @Override
    public void pay(double payment) {
        System.out.printf("Płatność ApplePay: %.2f zł%n", payment);
    }
}
