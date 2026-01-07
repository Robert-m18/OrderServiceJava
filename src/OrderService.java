public class OrderService {
    static int iloscZamowien = 0;
   private OrderRepository orderRep;
   private PaymentMethod paymentMethod;

    public OrderService(OrderRepository orderRep, PaymentMethod paymentMethod) {
        this.orderRep = orderRep;
        this.paymentMethod = paymentMethod;
    }

    public void process(Order order){
        System.out.print(++iloscZamowien+". ");
        paymentMethod.pay(order.getKwota());
        orderRep.save(order, paymentMethod);
    }
}
