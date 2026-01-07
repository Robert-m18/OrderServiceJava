import java.util.function.Supplier;

public enum PaymentType {
    BLIK(() -> new BlikPayment()),
    CARD(() -> new CardPayment()),
    PAYPAL(() -> new PaypalPayment()),
    APPLEPAY(() -> new ApplePayPayment());

    private final Supplier<PaymentMethod> creator;

    PaymentType(Supplier<PaymentMethod> creator) {
        this.creator = creator;
    }

    public PaymentMethod create() {
        return creator.get();
    }
}

