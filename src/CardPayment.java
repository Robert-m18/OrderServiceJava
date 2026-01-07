public class CardPayment implements  PaymentMethod{
    @Override
    public void pay(double payment) {
        System.out.printf("Płatność Kartą: %.2fzł%n", payment);

    }
}
