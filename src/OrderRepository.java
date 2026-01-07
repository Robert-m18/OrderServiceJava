import java.util.HashMap;

public class OrderRepository {

    private final HashMap<Order, PaymentMethod> listaZamowien;

    public OrderRepository(HashMap<Order, PaymentMethod> listaZamowien) {
        this.listaZamowien = listaZamowien;
    }

    public void save(Order order, PaymentMethod payment) {
        System.out.println("Zapisano zamówienie o ID: " + order.getID());
        listaZamowien.put(order,payment);
    }

    public void showList() {
        if (listaZamowien.isEmpty()) {
            System.out.println("Lista jest pusta!");
            return;
        }

        for (var entry : listaZamowien.entrySet()) {
            Order order = entry.getKey();
            PaymentMethod payment = entry.getValue();

            System.out.print(order + " | ");
            payment.pay(order.getKwota());
        }
    }


}
