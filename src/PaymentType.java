import java.util.function.Supplier;

public enum PaymentType {
    BLIK(BlikPayment::new),
    CARD(CardPayment::new),
    PAYPAL(PaypalPayment::new),
    APPLEPAY(ApplePayPayment::new);

    private final Supplier<PaymentMethod> creator;

    PaymentType(Supplier<PaymentMethod> creator) {
        this.creator = creator;
    }

    public PaymentMethod create() {
        return creator.get();
    }
}

