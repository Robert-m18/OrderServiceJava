public class PaymentFactory {

    public static PaymentMethod create(String typ) {
        try {
            return PaymentType.valueOf(typ.toUpperCase()).create();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Nieznana metoda płatności: " + typ
            );
        }
    }
}

