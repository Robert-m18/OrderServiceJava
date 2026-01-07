public class BlikPayment implements  PaymentMethod{
    @Override
    public void pay(double payment) {
        System.out.printf("Płatność Blikiem: %.2f zł%n", payment);



    }
}
