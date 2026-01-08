import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Main{
public static void main(String[] args) {

    try (BufferedReader reader = new BufferedReader(new FileReader("zamowienia.txt"))){
        OrderRepository repo = new OrderRepository(new HashMap<>());
        String linia;
        while ((linia = reader.readLine()) != null) {

            try {
                String[] tab = linia.split(", ");

                if (tab.length != 3) {
                    throw new IllegalArgumentException("Zły format linii: " + linia);
                }

                int id = Integer.parseInt(tab[0].trim());
                double kwota = Double.parseDouble(tab[1].trim());
                String typ = tab[2].trim();

                Order order = new Order(id, kwota);

                PaymentMethod payment = PaymentFactory.create(typ);


                OrderService service = new OrderService(repo, payment);
                service.process(order);


            } catch (IllegalArgumentException e) {
                System.out.println("Błąd danych: " + e.getMessage());
            }
            System.out.println();

        }
        repo.showList();

    }catch (IOException e) {
        System.out.println("Błąd podczas odczytywania pliku");
    }


}


}
